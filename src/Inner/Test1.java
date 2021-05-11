package Inner;

//测试  成员内部类
public class Test1 {
    public static void main(String[] args) {
        new A().new B().in();
        A.B a=new A().new B();
        a.in();
        //使用静态的内部类的资源
        System.out.println(new A.D().d);
        System.out.println(A.D.d1);
    }
}



class A{//外部类
    String name="jack";
    public void out(){
        //2.外部类使用内部类的资源age---必须创建内部类的对象
        System.out.println(new B().age);
        System.out.println("out....");
        //间接访问C里的资源
        System.out.println(new C().b);
    }
    //内部类————外部类的成员
    class B{
        int age=20;
        public void in(){
            //1.内部类使用外部类的资源name---直接用
            System.out.println(name);
            System.out.println("in....");
        }
    }
    //成员内部类：被private修饰
    private class C{
        double b=10;

    }
    //成员内部类：被static修饰
    static class D{
        String d="tony";
        static String d1="jack";
    }
}
