package HLJ.day0325;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        /*
        Scanner输入

        next,nextInt,nextDouble(这几个可以一起用)分隔符为空格，实际上换行也是

        nextLine(不要与上面一起用)分隔符为换行
         */

        Scanner sc=new Scanner(System.in);
//        System.out.println("1.在下一行输入你的姓名、年龄、成绩：");
//        String name=sc.next();
//        int age=sc.nextInt();
//        double score=sc.nextDouble();
//        System.out.println(name+","+age+","+score);

        System.out.println("2.在下一行输入你的姓名、年龄、成绩：");
        String str=sc.nextLine();
        System.out.println(str);
    }
}
