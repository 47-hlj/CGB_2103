package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test2 {
    public static void main(String[] args) {

    }
}

//1.定义注解
@Target({ElementType.LOCAL_VARIABLE,ElementType.TYPE})//出现位置
@Retention(RetentionPolicy.CLASS)//生命周期
@interface Mapper{
    //添加属性
    String local() default "";//给属性设置默认值
    String value();//value属性赋值时可以省略value=
}

//2.使用注解
//@Mapper(local="type")//修改local的默认值
//@Mapper("jack")//==@Mapper(value=="jack")，使用local默认值，并给value赋值，并可以省略value=
@Mapper(local="type",value = "jack")
class Annotation{
    String name;

    public void show(int a){
        int age=10;
    }

}