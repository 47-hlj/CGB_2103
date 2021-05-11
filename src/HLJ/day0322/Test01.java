package HLJ.day0322;

import java.util.Scanner;

//if-else/switch-case练习——分数
public class Test01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = scan.nextInt();
        /*if(score>=90){
            System.out.println("优秀");
        }
        else if(score>=80){
            System.out.println("良好");
        }
        else if(score>=70){
            System.out.println("一般");
        }
        else if(score>=60){
            System.out.println("及格");
        }
        else{
            System.out.println("不及换");
        }*/

        switch (score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("一般");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 9:
            case 10:
                System.out.println("优秀");
                break;
            default:
                System.out.println("分数错误");
                break;
        }
    }
}
