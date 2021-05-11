package OOP.day09;

//测试 抽象类的使用

/**总结：
 *1.抽象类可以有构造方法，为了子类的new，抽象类不能new
 *2.抽象类能有成员变量、常量
 *3.抽象类的普通方法和抽象方法
 */

public class Test5 {
    public static void main(String[] args) {
        new Son3();
        Father3 f=new Son3();
        System.out.println(f.name);
        f.name="rose";//修改变量的值
        System.out.println(f.name);
        System.out.println(Father3.AGE);
        f.eat1();
        f.eat2();
        f.eat3();
    }
}

//提供抽象类
abstract class Father3 {
    //1.TOO Constructor....抽象类构造方法为了子类的new
    public Father3() {
        System.out.println("这是父类的构造方法，用来new");
    }

    //2.抽象类里的成员变量、常量
    String name = "jack";
    public static final int AGE = 10;//常量的标准写法
    //final int age=10   //常量的简写

    //3.抽象类的普通方法和抽象方法
    abstract public void eat1();//没有方法体的方法
    abstract public void eat2();//没有方法体的方法
    public void eat3() {//普通方法，有方法体的方法
        System.out.println(3);
    }
}

//4.子类继承了抽象的父类后，需要重写所有抽象方法，否则子类也必须是一个抽象类
//5.继承父类的普通方法，不一定需要重写，当想改变父类方法功能才重写
class Son3 extends Father3{
    public Son3(){
        //super(); //自动调用父类的无参构造方法
        System.out.println("这是子类的构造方法，用来new");
    }
    @Override
    public void eat1() { System.out.println(1); }
    @Override
    public void eat2() {
        System.out.println(2);
    }
}