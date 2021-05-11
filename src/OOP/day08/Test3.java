package OOP.day08;

//测试  继承里的构造方法

/**
 * 总结：
 * 1.构造方法的作用是:用来灵活的new
 * 2.继承后，子类的构造方法里会隐藏super（）---意思是会自动调用父类的无参构造方法
 * 3.
 */
public class Test3 {
    public static void main(String[] args) {
        Zi3 zi3 = new Zi3();
    }
}
    class Fu3{
        int a;
        public Fu3() {
            System.out.println(1);
        }
        public Fu3(int a) {
            this.a = a;
            System.out.println(a);
        }
    }

    class Zi3 extends Fu3{
        public Zi3() {
            //1.子类构造方法里隐藏了super()，会自动调用父类的 无参构造方法
//            super();
            //2.触发父类的  含参构造方法
            super(100);
            //3.super关键字，如果出现在子类的构造方法里，必须是第一条语句
            System.out.println(2);
        }
    }
