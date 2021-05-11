package API.day13;

import java.io.*;
import java.util.Scanner;

//复制文件
public class Test3 {
    public static void main(String[] args)  throws IOException {
        String from = new Scanner(System.in).nextLine();//1,源文件
        String to = new Scanner(System.in).nextLine(); //2,目标文件
        copyOf(from,to); //3,复制
        System.out.println("文件复制完成...");
    }
    //复制文件
    public static void copyOf(String from, String to)  {
        InputStream in = null;//为了finally也能用
        OutputStream out = null;//为了finally也能用
        try{
            //1,读取from文件
            in = new BufferedInputStream(new FileInputStream(from));
            //2,写出to文件
            out = new BufferedOutputStream(new FileOutputStream(to));
            //3,读一个写一个
            int b = 0;//定义变量，记录读到的数据

            long start = System.currentTimeMillis();//计时开始ms
            //        while( ( b = in.read() ) != -1){//一个一个的读，没数据时返回了-1
            //            out.write(b);//写出去
            //        }
            byte[] buf = new byte[8192];//模拟底层的数组容量8K
            while( ( b = in.read(buf) ) != -1){//一个数组一个数组的读
                out.write(buf);//一个数组一个数组的写 存在问题，每次都是8192
//                out.write(buf,0,b);解决上述write的问题
            }
            long end = System.currentTimeMillis();//计时结束ms
            System.out.println(end-start);//97ms->2ms->0ms
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //TODO 改造 -- 为了保证资源一定会被释放，必须放入finally中
            //4,关闭资源
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}