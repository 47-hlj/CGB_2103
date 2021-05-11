package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//测试  暴力放射
public class Test6 {
    public static void main(String[] args)throws Exception {
//        method();//所有方法
        method2();//所有属性
    }



    //暴力反射所有方法
    public static void method() throws Exception {
        Class c=Human.class;
        Method[] methods=c.getDeclaredMethods();
        for(Method method:methods){
            Object o=c.newInstance();
            if(method.getName().equals("test1")){
                method.invoke(o);
            }
            //想执行private/default的
            if(method.getName().equals("test2")){
                //开启权限。否则操作私有资源会抛出异常IllegalAccessException
                method.setAccessible(true);
                method.invoke(o,"Hello Java");
            }
        }
    }

    //暴力放射所有属性
    public static void method2() throws Exception{
        Class c=Human.class;
        Field[] fields=c.getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            Object o=c.newInstance();
            //对所有属性进行get/set
            if(field.getName().equals("age")){
                field.set(o,22);
                System.out.println(field.get(o));
            }
            if(field.getName().equals("salary")){
                field.set(o,15000.0);
                System.out.println(field.get(o));
            }
            if(field.getName().equals("name")){
                field.set(o,"HLJ");
                System.out.println(field.get(o));
            }

        }
    }
}
