package Reflection;


//测试反射
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //解析String.class里的所有资源
        //获取Class对象---三种方式
        Class c1=Class.forName("java.lang.String");//参数为类的全路径(包名+类名)
        Class c2=String.class;
        Class c3=new String().getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1.getSimpleName());//类名String
        System.out.println(c1.getPackage().getName());//包名java.lang
        System.out.println(c1.getName());//全路径java.lang.String
    }
}
