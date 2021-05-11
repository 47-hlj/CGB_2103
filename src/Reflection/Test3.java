package Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


//反射的高级用法
public class Test3 {
    public static void main(String[] args) throws Exception {
        //        method();//反射创建对象
        //        method2();//反射操作属性
        method3();//反射操作方法

    }
    //反射操作方法
    private static void method3() throws Exception {
        //1,获取class对象
        Class c = Person.class;
        //2,利用反射执行方法
        //获取指定的方法
        //getMethod(1,2)--1是方法名2是参数类型的class对象
        //public void show(int a,String b){}
        Method m = c.getMethod("show",int.class,String.class);
        Object obj = c.newInstance();
        //Object invoke(1,2)--1是要执行哪个对象的方法--2是调用方法时要传入的具体参数
        m.invoke(obj,10,"tony");//执行方法
    }
    //反射操作属性
    private static void method2() throws Exception {
        //1,获取class对象
        Class c = Person.class;
        //2,利用反射set/get
        Field f = c.getField("age");
        //set(1,2)--1是要给哪个对象设置值--2是要设置的具体值是啥
        Object obj = c.newInstance();
        f.set(obj, 100);//给属性设置值
        //get(1)--1是要获取哪个对象的值
        System.out.println(f.get(obj));//获取属性值
    }
    //反射创建对象--newInstance()
    private static void method() throws Exception {
        //1,获取class对象
        Class c = Person.class;
        //2,利用反射new -- newInstance()
        Object o = c.newInstance();//会调用 无参的构造方法
        System.out.println(o);//cn.tedu.reflection.Person@1b6d3586
        //3,获取 要调用 含参 构造方法
        //getConstructor()参数是含参构造需要的参数类型的class对象
        Constructor con = c.getConstructor(String.class);
        //newInstance()参数是要触发含参构造时,想要具体指定的参数值
        Object o2 = con.newInstance("jack");
        System.out.println(o2);
        //调用Person的资源
        Person p = (Person) o2;//向下转型,就是用子类的功能
        p.test();
        p.show(10,"x");
    }
}