package day05;

import java.util.Random;
import java.util.Scanner;
//测试 while循环
//--产生一个随机数，和用户一直在输入的数字比较。
public class Test3 {
    public static void main(String[] args) {
        //1,产生随机 整数-nextInt(N)-产生N范围内的随机数(默认从0开始)
        int suiji = new Random().nextInt(100) +1 ;
        System.out.println(suiji);
        //死循环--本质就是因为条件永远成立
//		for(int i = 0 ; i < 10 ; i--){
        //先判断再执行,如果没有满足判断条件,一次也不会执行
//		while(suiji > 50){
//		while(true){
        do{
            //2,接收用户输入的数字
            int input = new Scanner(System.in).nextInt();
            //3,开始比
            if(input > suiji) {
                System.out.println("大了");
            }else if(input < suiji) {
                System.out.println("小了");
            }else if(input == suiji) {
                System.out.println("猜中了!!!");
                break;
            }
        }while(true);
    }
}