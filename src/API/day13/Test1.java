package API.day13;

import java.io.*;
//测试 字节流写出
//总结:
//1,效率上来讲谁快?  BufferedOutputStream  > FileOutputStream
//2,为什么?  BufferedOutputStream底层维护了一个数组byte[] buffer
public class Test1 {
    public static void main(String[] args) throws IOException {
        //        method();//FileOutputStream
//        method2();//BufferedOutputStream
        method3();
    }

    //FileOutputStream
    public static void method() throws IOException {
        //1,创建对象--参数是文件的路径
        OutputStream out = new FileOutputStream("D:\\iotest\\1.txt");
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
    //BufferedOutputStream
    public static void method2() throws IOException {
        //1,创建对象
        OutputStream out = new BufferedOutputStream(
                new FileOutputStream(
                        "D:\\iotest\\1.txt",true) );
        //2,调用方法写出
        out.write(90);
        //3,关闭资源
//        out.flush();//把数据从out流里，刷到磁盘中
        out.close();//包含flush()的功能
        out.write(80);
    }

    //追加，不是数据覆盖
    //在FileOutputStream(name,append) append为true进行追加
    //FileOutPutStream(name)默认为false进行覆盖
    public static void method3() throws IOException {
        //1,创建对象
        OutputStream out = new BufferedOutputStream(
                new FileOutputStream(
                        "D:\\iotest\\1.txt",true) );
        //2,调用方法写出
        out.write(90);
        //3,关闭资源
        out.close();
    }

}
