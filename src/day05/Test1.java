package day05;


//测试  嵌套for循环
public class Test1 {
    public static void main(String[] args) {
        method();//1.外循环执行一次，内循环执行n次
        method2(); //2.外循环控制行，内循环控制列
        method3();//3.练习：打印5行5列的*
        method4();
        method5();
        method6();
    }

    //1.外循环执行一次，内循环执行n次
    public static void method(){
        for (int i = 0; i < 3; i++) {//外循环执行三次
            for (int j = 0; j < 5; j++) {//内循环执行5次
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //2.外循环控制行，内循环控制列
    public static void method2(){
        for (int i = 0; i < 3; i++) {//外循环执行三次
            for (int j = 0; j < 5; j++) {//内循环执行5次
                System.out.print("*");//同一行
            }
            System.out.println();//换行
        }
    }

    //3.练习：打印5行5列的*
    public static void method3(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //4.打印三角形
    public static void method4(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //5.99乘法表
    public static void method5(){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

    public static void method6(){
        for (int i = 1,j = 1; i <= 9 ; j++) {
            System.out.print(j+"*"+i+"="+j*i+"\t");
            if (i==j){
                System.out.println();
                i++;
                j=0;
            }
        }
    }

}

