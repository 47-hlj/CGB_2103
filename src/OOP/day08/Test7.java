package OOP.day08;
//测试  final关键字---可以修饰类、方法、变量

/**总结：
 * 1.final修饰的类，不能被继承
 * 2.final修饰的常量只能被继承，值不能被修改
 * 3.final修饰的方法，不能被子类重写
 */
public class Test7 {
    public static void main(String[] args) {
        Zi5 z=new Zi5();
        z.eat();
//      z.name="rose";//修改属性的值
        System.out.println(z.name);//打印属性的值
    }
}

 class Fu5{
    final String name ="jack";
    final public void eat(){
        System.out.println(1);
    }
}

class Zi5 extends Fu5{

//    public void eat(){d
//        System.out.println(2);
//    }
}
