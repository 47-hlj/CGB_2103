package API.day12;

import java.io.*;

public class Test3 {
    public static void main(String args[]) throws IOException {
        //method();//FileInputStream
        method2();//BufferedInputStream

    }

    //FileInputStream读取
    public static void method() throws IOException {
        //1.创建多态对象
        File file=new File("D:\\iotest1\\1.txt");
        //FileInputStream(String name)
//        InputStream inputStream1=new FileInputStream("D:\\iotest1\\1.txt");
        //FileInputStream(File file)
        InputStream inputStream=new FileInputStream(file);


        //2.调用方法
//        int data=inputStream.read();
//        System.out.println(Character.toChars(data));
//        System.out.println(inputStream.read());
//        System.out.println(inputStream.read());
//        //2.1.没有数据，返回-1
//        //2.2 read()的默认返回值是int类型--强转或者Character.toChars();
//        System.out.println(inputStream.read())

        while(true){
            int data=inputStream.read();
            if(data==-1)
                break;
            System.out.println((char) data);
        }

        //3.关闭资源
        inputStream.close();
    }


    public static void method2() throws IOException{
        //1.创建多态对象
        InputStream inputStream=new BufferedInputStream(new FileInputStream("D:\\iotest1\\1.txt"));

        //2.读取数据
//        System.out.println(inputStream.read());
        while(true){
            int data=inputStream.read();
            if(data==-1)
                break;
            System.out.println((char) data);
        }
        //3.关闭资源
        inputStream.close();

    }
}
