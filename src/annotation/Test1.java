package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test1 {
    public static void main(String[] args) {

    }
}


//第一步：创建注解@interface 注解名
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@interface Controller{

}

//第二部：使用注解 @注解名
@Controller
class Demo{
//    @Controller//位置不对，不能用
    String name;
//    @Controller//位置不对，不能用
    public void show(){
        System.out.println(1);
    }
}