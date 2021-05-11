package OOP.day10;

//测试 接口的使用

/**总结：
 * 1,接口是一个特殊的抽象类,特殊在 接口里的方法都是抽象方法
 * 2,接口没有构造方法,没有变量.有常量(可以简写)
 *   +有抽象方法(可以简写)+有普通方法(jdk1.8)
 * 3,实现类实现了接口,需要重写所有的抽象方法,否则是一个抽象类
 * 4,实现类必须要重写普通方法吗?--想改才重写普通方法
 * 5,接口的常量可以简写:int a = 10;会自动拼接public static final
 * 6,接口的抽象方法可以简写:void  show();会自动拼接public abstract
 * 7,接口不能new/实例化
 * 8,接口突破了java单继承的局限性,可以多继承,多实现,继承时多实现
 */
public class Test2 {
    public static void main(String[] args) {
        Inter in=new InterImpl();
//        in.age=20;
        System.out.println(in.age);
        System.out.println(Inter.age);
    }
}

//创建接口
interface Inter{
    //TODO Constructor..
    //1.接口里没有构造方法
//    public Inter(){}

    //TODO Fields..
    //2.接口里没有变量，都是常量(可以简写)
    int age=10;
    //接口会为简写的常量。自动拼接public static final
    //public static final int age = 10;

    //TODO Method..
    //3.接口里的抽象方法可以简写
    void show1();
    //接口会为简写的重抽象方法，自动拼接public abstract
    // abstract public void show1()

    //4.接口里的普通方法---jdk1.8提供的新语法
    default void show2(){}
    static void show3(){}
}

//5.实现类实现了接口以后，需要重写所有的抽象方法，否则是一个抽象类
//重写接口里的抽象方法，注意权限，只能使用public(接口里的抽象方法默认为public)
class InterImpl implements Inter{
    @Override
    public void show1() {
        System.out.println(1);
    }
}