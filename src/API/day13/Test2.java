package API.day13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //        method();//FileOutputStream
        method2();//BufferedOutputStream
    }
    //BufferedOutputStream
    public static void method2() throws IOException {
        //1,创建对象
        OutputStream out = new BufferedOutputStream(
                //                            new FileOutputStream("E:\\iotest\\1.txt") );//数据覆盖
                //数据追加
                new FileOutputStream("E:\\iotest\\1.txt",true));
        //2,调用方法写出
        out.write(90);
        //3,关闭资源
        out.flush();//把数据从out流里，刷出到磁盘里
        //        out.close();//flush+close
        //        out.write(90);
    }
    //FileOutputStream
    public static void method() throws IOException {
        //1,创建对象--参数是文件的路径
        OutputStream out = new FileOutputStream("E:\\iotest\\1.txt",true);
        //2,调用方法写出
        out.write(97);//一个一个的写出
        out.write(98);
        out.write(99);
        out.write(100);

        byte[] bs = {50,51,52};
        out.write(bs);//一个数组里的数据都写出
        //3,关闭资源
        out.close();
        // close()之后不能继续写出,否则抛出异常:Stream Closed
        //        out.write(100);
    }
}

