package API.day11;

import java.math.BigDecimal;
import java.util.Scanner;

//测试  BigDecimal工具类
public class Test3 {
    public static void main(String[] args) {
//        method();
        method2();
    }
    public static void method(){
        //1.接收输入的两个小数
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        //做运算
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    public static void method2(){
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        //1.创建对象-BigDecimal
//        BigDecimal(double val) ----有坑！
//        BigDecimal(String val) ----推荐！
        BigDecimal bd1=new BigDecimal(String.valueOf(a));
        BigDecimal bd2=new BigDecimal(String.valueOf(b));
        System.out.println(bd1.add(bd2));//加法
        System.out.println(bd1.subtract(bd2));//减法
        System.out.println(bd1.multiply(bd2));//乘法
//        dividi(1,2,3)---1是除数  2是小数位数 3是四舍五入模式
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_DOWN));//除法




    }
}
