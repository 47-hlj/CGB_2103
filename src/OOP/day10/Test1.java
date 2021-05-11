package OOP.day10;

//测试---接口

/**
 * 接口与抽象类的区别
 * 1.接口是特殊的抽象类
 * 2.语法定义不同 interface与abstract class
 * 3.接口没有变量，只有常量，可以简写会自动拼接public static final
 *   抽象类可以有常量、变量；常量定义不能简写
 * 4.接口只能包含抽象方法、default和static(后面两个jdk1.8提供)
 *   抽象类可以有抽下抽象和普通方法
 *   接口中的抽象方法可以简写会自动拼接 public abstract；而抽象类中不可以
 * 5.接口突破了java单继承的局限性，可以多继承，多实现，继承时多实现
 */
public class Test1 {
    public static void main(String[] args) {
//        new A(); //1.接口和抽象类，都不能new
        A a=new B();//统一调用标准、多态、向上造型
        //多态里，只能调用左边的方法
        a.show1();
        a.show2();
    }

}
//第一步：通过关键字interface创建接口
interface A{
    //1.接口是一个特殊的抽象类，因为接口里面都是抽象方法，不能有普通方法
    void show1();
    void show2();
}

//第二步，创建接口的实现类
//1.实现类需要 重写所有的抽象方法，否则，包含着抽象方法是一个抽象类
class B implements A{
    @Override
    public void show1() {
        System.out.println(1);
    }
    @Override
    public void show2() {
        System.out.println(2);
    }
}