package HLJ.day0329;

import java.util.Scanner;

/*
  一个简易的达内ATM机系统
 */
public class Atm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println( "欢迎使用达内存取款系统!" );
        System.out.print("请输入密码：");
        String password="123456";
        String mima=scanner.nextLine();
        if (mima.equals(password)){
            System.out.println( "请输入您的操作: 1-查询余额, 2-存钱, 3-取钱, 4-退出" );
            int a=scanner.nextInt();
            double balance=2000.0;
            switch (a){
                case 1:
                    System.out.println("您的账户余额为："+balance+"元");
                    break;
                case 2:
                    System.out.print("请放入你存入的钞票：");
                    double save=scanner.nextDouble();
                    balance+=save;
                    System.out.println("存钱成功！您的账户余额为："+balance+"元");
                    break;
                case 3:
                    System.out.print("请输入你要取款金额：");
                    double get=scanner.nextDouble();
                    if(get<=balance)
                        System.out.println("取钱成功！您的账户余额为："+balance+"元");
                    else
                        System.out.println("您的账户余额不足！");
                    break;
                case 4:
                    System.out.println("请取走你的卡，欢迎使用！");
                    break;
                default:
                    System.out.println("操作有误！");
            }
        }else{
            System.out.println("密码错误！");
        }
    }
}
