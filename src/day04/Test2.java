package day04;

import java.util.Scanner;
//测试 分支结构
public class Test2 {
    public static void main(String[] args) {
        //1，接受用户输入的分数
        double score = new Scanner(System.in).nextDouble();
        //2,调用方法，记录返回来的结果
        String desc = method(score);
        System.out.println("您的得分是："+score+"，属于："+desc);
    }
    public static String method(double a){
        if(a >= 0 && a <= 100) {//优化:增强程序的健壮性
            String x = "优秀" ; //定义变量,记录描述信息
            if(a >= 90) {//90分以上 优秀
                x = "优秀" ;   //修改变量的值
            }else if(a >= 80 && a <= 89) {//80~89 良好
                x = "良好" ;  //修改变量的值
            }else if(a >= 70 && a <= 79) {//70~79 中等
                x = "中等" ;  //修改变量的值
            }else if(a >= 60 && a <= 69) {//60~69 及格
                x = "及格" ;
            }else{//60分以下 不及格
                x = "不及格" ;
            }
            return x ;//把结果返回给调用位置
        }else {
            return " 非法数据！！";
        }

    }

}






