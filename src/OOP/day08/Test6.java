package OOP.day08;

public class Test6 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("OOP.day08.Student");//类的加载

        new Student();//静态代码块->构造代码块->构造方法

        new Student();//构造代码块->构造方法   (静态代码块只加载一次)

        /*

         */

    }
}

class Student{
    // 静态代码块：在成员位置+用来初始化项目+类加载时触发
    static{
        System.out.println("静态代码块");
    }
    // Constructor：在成员位置+用来new
    public Student() {
        System.out.println("构造方法");
    }
    // 构造代码块：在成员位置+用来提取过早方法里的共性+new时
    {
        System.out.println("构造代码块");
    }
    // 局部代码块：在局部位置+用来控制变量的作用范围+调用方法时
    public void show(){
        System.out.println("局部代码块");
    }
}
