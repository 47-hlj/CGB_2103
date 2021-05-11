package thread.day17;

//测试   单例模式

public class Test5 {
    public static void main(String[] args) {
        Person p=Person.getP();
        System.out.println(p);//thread.day17.Person@6d6f6e28
        Person p1=Person.getP();
        System.out.println(p1);//thread.day17.Person@6d6f6e28
        System.out.println(p==p1);//true
    }
}

//饿汉式---简单，框架底层用
class Person{
    //1.不让外界new---私有化构造方法
    private Person(){};
    //2.自己new一个给外界准备的对象
    //加static,想要被静态getP()方法调用,p必须也要是静态的
    private static Person p=new Person();
    //3.提供一个方法，给外界得到对象
    //加static，getP()方法不能通过对象调用，可以直接类名.方法们调用
    public static Person getP(){
        return p;
    }
}
