package OOP.day09;

//测试  异常
/**
 * try - catch - finally
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        method();//暴露异常
//        method2();//捕获异常
//        try{
//            method3();//抛出异常
//        }catch (Exception e){
//            System.out.println("执行错误。。");
//        }
        method4();
    }

    //暴露异常
    public static void method(){
        //1.接受用户输入的两个整数
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        //2.做除法运算
        System.out.println(a/b);
    }

    //捕获异常:自己的问题自己处理，调用者很安全
    /**   捕获异常语法
     * try{
     *     有问题代码
     * }catch(异常类型1 异常名){
     *     给出解决异常方案
     * }catch(异常类型2 异常名){
     *     给出解决异常方案
     * }
     */
    public static void method2() {
        try {
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();//开发调试调试阶段
            System.out.println("第二次输入不能为0！");
        }catch (InputMismatchException e){
            System.out.println("请输入两次整数！");
        }catch (Exception e){
            System.out.println("请输入正确的数据！");
        }
        //接下来不知道还要几个异常，不知道叫啥，通用的解决方案--多态
        //不关心具体的子类类型，把子类当做父类看
    }

    //抛出异常：交给调用者处理
    /**
     * 直接在方法声明处添加：throws 异常类型
     */
    public static void method3() throws ArithmeticException,InputMismatchException{
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a/b);
    }

    //try-catch-finally
    public static void method4(){
        try{
            System.out.println(1);
            System.out.println(2);
            System.out.println(1/0);//出现异常
            System.out.println(3);//异常之后的代码不会执行
        }catch (Exception e){
            e.printStackTrace();
        }finally {//保证finally里的一定会执行
            System.out.println(4);
        }
    }

}
