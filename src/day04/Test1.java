package day04;

import java.util.Scanner;
//测试 分支结构
//接收用户输入的原价。满1000打9折。满2000打8折。满5000打5折。
public class Test1 {
    public static void main(String[] args) {
        //1,接收用户输入的原价。
        double price = new Scanner(System.in).nextDouble();
        //dazhe(price);//调用方法,计算折后价 V1.0
        double x = dazhe(price);//调用方法,计算折后价 V2.0
        System.out.println("原价是"+price+",折后价是"+x);
    }
    //计算折后价
//	public static void dazhe(double a) {//V1.0
    public static double dazhe(double a) {//V2.0
        //1，定义变量，记录折后价
        double b = 0 ;
        if(a >= 5000){//a满5000打5折。
            b = a*0.5;//a打5折
        }else if(a >= 2000){//满2000打8折。
            b = a*0.8;//a打8折
        }else if(a >= 1000){//满1000打9折。
            b = a*0.9;//a打9折
        }else{//不打折
            b = a ;
        }
        return b;//通过return关键字把结果返回给调用位置
//		System.out.println("原价是1000,折后价是900");
//		动态数据在中间位置  "+?+"
//		System.out.println("原价是"+a+",折后价是"+b);
    }
}




