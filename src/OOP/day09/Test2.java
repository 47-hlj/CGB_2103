package OOP.day09;

//测试  多态中成员变量、方法、静态资源

/**
 * 总结：
 * 1.不能被继承：private 、构造方法
 * 2.不能被重写:static/ final / private / 构造方法
 * 3.多态统一调用标准：只能调用父类的
 * 4.使用子类特有的：多态不支持，只能new一个子类对象
 * 5.多态好处：增强程序的通用性/统一标准
 * 多态根本不关心具体的子类类型，屏蔽掉了子类之间的不同，把子类当父类来看
 */
public class Test2 {
    public static void main(String[] args) {
        //口诀1：父类引用 指向 子类对象
        Father father=new Son();
        //口诀2:编译看左边(只能调用父类的)
                //运行看右边(如果方法被重写了，执行子类的方法体)
        System.out.println(father.age);//1.使用了父类的10；
        father.eat();//2.重写了，使用了父类的方法声明，使用子类的方法体
        father.sleep();//3.没重写，使用父类的方法声明和方法体
//        father.show();//多态对象不能用子类扩展
        father.game();//4.使用了父类的
        Father.game();

        Son son1=(Son) father;
        son1.show();
    }
}

//成员变量、方法、静态资源
class Father{
    //成员变量
    int age=10;
    public void eat(){
        System.out.println(1);
    }
    public void sleep(){
        System.out.println(2);
    }
    static public void game(){
        System.out.println(3);
    }
}

class Son extends Father{
    int age=20;
    @Override
    public void eat() {
        System.out.println(100);
    }
    public void show() {
        System.out.println(200);
    }
    static public void game(){
        System.out.println(300);
    }
}