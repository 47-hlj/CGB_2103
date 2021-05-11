package HLJ.day0323;

import java.util.Scanner;

//双重for循环
public class Demo06 {
    public static void main(String[] args) {

        /*
        想要打印九行九列*(每次打印一个*)
         */

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        九九乘法表
        转义字符'\t'——水平制表，对齐；
         */
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+"*"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }

        /*
        打印金字塔
         */
        int n=new Scanner(System.in).nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        打印菱形
         */
//        int i=1;
//        for (; i <= n/2+1 ; i++) {
//            for (int j = 1; j <= n/2+1-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (i+=1; i <= n ; i++) {
//            for (int j = 1; j < ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j < ; j++) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }
    }
}

