package API.day13;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

//读取键盘的输入的数据并打印
public class Test4 {
    public static void main(String[] args){
        InputStream in=null;//finally中的in也能
        try{
            //1.创建读取流
            in=new BufferedInputStream(System.in);
            //2.开始读取
            int b=0;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        }
        catch (IOException e){
            e.printStackTrace();;
        }finally{
            //3.释放资源
//            try {
//                in.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            IOUtils.close(in);
        }

    }
}
