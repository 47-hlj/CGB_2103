package HLJ.day0322;

import java.util.Random;

//if-else
public class Demo03 {
    public static void main(String args[]){
        Random rand=new Random();//创建随机数对象
        int num =rand.nextInt(100);
        if(num<50){
            System.out.println("谢谢惠顾");
        }else if(num<80){
            System.out.println("三等奖");
        }else if(num<90){
            System.out.println("二等奖");
        }else if(num<99){
            System.out.println("一等奖");
        }else if(num==99){
            System.out.println("特等奖");
        }else{
            System.out.println("做梦");
        }
    }
}
