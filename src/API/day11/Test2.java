package API.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//测试 Date工具类
public class Test2 {
    public static void main(String[] args) throws ParseException {
        //method();//Date
        method2();//SimpleDateFormat

    }

    public static void method2() throws ParseException {
        //1.输入的出生日期
        String date=new Scanner(System.in).nextLine();
        //2.开始算天数 String->Date

        //2-1.创建对象--SimpleDateFormat(String pattern)
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
        //2.Date parse(String text)
        Date birthday=simpleDateFormat.parse(date);//String ->Date
        long start=birthday.getTime();
        long now =System.currentTimeMillis();
        System.out.println((now-start)/1000/60/60/24);
    }

    public static void method() {
        //1.创建对象
        Date date=new Date();
        //2.调用方法
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        System.out.println(date.toLocaleString());
        System.out.println(date.toInstant());
    }
}
