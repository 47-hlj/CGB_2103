package HLJ.day0323;

import java.util.Scanner;

//猜数字游戏
public class Test01 {
    public static void main(String[] args) {
        int num=(int)(100*Math.random())+1;
        System.out.println(num);
        int score=100;
        int i=1;
        for(;i<=10;i++){
            int a = new Scanner(System.in).nextInt();
            if (a > num){
                System.out.println("猜大了");
                score-=10;
            }else if(a<num){
                System.out.println("猜小了");
                score-=10;
            }else {
                System.out.println("恭喜你猜对了！你的最终得分是:" + score);
                break;
            }
        }
        if(i==10){
            System.out.println("游戏结束，你的机会用光了!");
        }
    }
}
