package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
//        method();//反射操作成员变量
//        method2();//反射操作成员方法
        method3();//反射操作构造方法
    }
    //反射操作成员变量
    public static void method() throws Exception{
        //1.获取Class对象
        Class c=Human.class;
        //2.获取成员变量
        Field[] f=c.getFields();
        Object o=c.newInstance();
        //遍历数组，得到每个变量field
        for (Field field:f) {
            System.out.println(field.getName());
            //3.只对name属性进行set/get
            if(field.getName().equals("name")){
                field.set(o,"HLJ");
                System.out.println(field.get(o));
            }
        }
    }
    //反射操作成员方法
    public static void method2() throws Exception{
        //1.获取Class对象
        Class c=Human.class;
        //2.获取成员方法
        Method[] methods=c.getMethods();
        Object o=c.newInstance();
        for(Method m:methods){
            System.out.println(m.getName());
            //只执行test1()
            if(m.getName().equals("test3")){
                m.invoke(o,100);//执行方法
            }
        }
    }
    //反射操作构造方法
    public static void method3() throws Exception{
        //1.获取Class对象
        Class c=Human.class;
        //2.获取构造方法
        Constructor[] constructors=c.getConstructors();
        //3.遍历数组，得到每个构造方法constructor
        for(Constructor constructor:constructors){
            Class[] classes=constructor.getParameterTypes();
            if(classes.length==0) {//无参构造
                Object o=constructor.newInstance();
                System.out.println(o);
            }else {
                Object o=constructor.newInstance("HLJ",22,15000);
                System.out.println(o);
            }

        }
//        Object o1=c.newInstance();
//        Constructor constructor=c.getConstructor(String.class,int.class,double.class);
//        Object o2=constructor.newInstance("HLJ",22,32130.94);
//        Field[] f=c.getFields();
//        for(Field field:f){
//            System.out.println(field.get(o1));
//        }
//        for(Field field:f){
//            System.out.println(field.get(o2));
//        }

    }
}
