package HLJ.day0322;

import java.util.Scanner;

//swith-case练习——每月多少天
public class Test03 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("输入月份(1-12):");
        int month=scan.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("28\29天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            default:
                System.out.println("月份输入错误，请输入1-12");
                break;
        }
    }

}
