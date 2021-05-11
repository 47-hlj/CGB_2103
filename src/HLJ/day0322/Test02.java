package HLJ.day0322;

import java.util.Scanner;

//if-else练习——商品价格打折
public class Test02 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("输入商品单价:");
        double price=scan.nextDouble();
        System.out.println("输入商品数量:");
        int num=scan.nextInt();
        double sum=(double) price*num;
        if(price<0||num<0){
          System.out.println("价格、数量不能为负数");
        } else if(sum>=1000){
            sum*=0.7;
        }else if(sum>=500){
            sum*=0.8;
        }else if(sum>=100){

            sum*=0.9;
        }
        System.out.println("商品折后总价格:"+sum);
    }
}
