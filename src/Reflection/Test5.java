package Reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//反射有注解的类，并new
public class Test5 {
    public static void main(String[] args)  throws Exception{
        //3.解析注解----框架完成！
        //利用反射，执行带有注解的方法
        //获取class对象
        Class c=Demo.class;
        //获取所有方法
        Method[] methods=c.getMethods();
        //遍历数组，得到每个method
        for(Method method:methods){
            //获取方法的注解并进行判断是否存在注解
            if(method.getAnnotation(Controller.class)!=null){
                Object o=c.newInstance();
                //只执行使用了注解的方法
                method.invoke(o);
            }
        }
    }
}

//1.定义注解----框架完成！
@Target(ElementType.METHOD)//注解可以出现在方法上
@Retention(RetentionPolicy.RUNTIME)//注解可以存在的时间
@interface  Controller{
}
//2.使用注解----重点！！！
class Demo{
    String name="jack";
    @Controller
    public void method(){
        System.out.println(123);
    }
    public void method2(){
        System.out.println(321);
    }
}