package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//测试 反射Person文件
public class Test2{
    public static void main(String[] args) throws ClassNotFoundException {
        //        method();//获取Class对象
        //        method2();//获取包名、类名
        //        method3();//获取 所有构造方法们~
        //        method4();//获取 所有方法们~
        method5();//获取 所有属性们~
    }

    //获取 所有的属性/成员变量们~
    private static void method5() throws ClassNotFoundException {
        //1,获取Class对象
        Class c = Class.forName("cn.tedu.reflection.Person");
        //2,使用Class的方法--只能获取public的
        Field[] fs = c.getFields();
        //遍历数组，获取每个变量f
        for (Field f : fs) {
            System.out.println( f.getName() ); //获取变量名
            System.out.println( f.getType().getName() );//获取变量类型
        }
    }
    //获取 所有的方法们~
    private static void method4() {
        //1,获取Class对象
        Class c = Person.class;
        //2,使用Class的方法getMethods()--获取自己的和父类的-只能获取public的
        Method[] ms = c.getMethods();
        //遍历数组，获取每个方法
        for(Method m : ms){
            //获取方法名
            System.out.println( m.getName() );
            //获取参数的类型
            Class[] cc = m.getParameterTypes();
            System.out.println( Arrays.toString(cc) );
        }
    }
    //获取 所有的构造方法们---getConstructors()
    private static void method3() {
        //1,获取Class对象
        Class c = Person.class;
        //2,使用Class的方法getConstructors()--只能获取public的
        Constructor[] cs = c.getConstructors();
        //遍历数组,获取每个构造方法co
        for(Constructor co : cs){
            //获取名字
            System.out.println( co.getName() );
            //获取参数类型
            Class[] cs2 = co.getParameterTypes();
            System.out.println( Arrays.toString(cs2) );
        }
    }
    //获取包名、类名
    public static void method2() {
        //1,获取Class对象
        Class c = Person.class;
        //2,使用Class的方法
        System.out.println( c.getSimpleName() );//类名
        System.out.println( c.getPackage().getName() );//包名
        System.out.println( c.getName() );//全路径名
    }
    //获取Class对象
    public static void method() throws ClassNotFoundException {
        Class c1 = Class.forName("cn.tedu.reflection.Person");
        Class c2 = Person.class;
        //        Class c3 = new Person().getClass();
    }
}