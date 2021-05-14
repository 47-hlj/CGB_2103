package jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lambda表达式
 * 在Java中，Lambda表达式的对象，必须依附于特别的对象类型——函数式接口
 */
public class Test3 {
    public static void main(String[] args) {
        //Lambda形式实现
        TheInterface theInterface=()->{};
        System.out.println(theInterface.getClass().getInterfaces()[0]);

        TheInterface2 theInterface2=()->{};
        System.out.println(theInterface2.getClass().getInterfaces()[0]);

        new Thread(()->{ System.out.println("hello world"); }).start();

        //list中每个字符串变成大写输出
        List<String>  list= Arrays.asList("hello","world","hello world");

//        list.forEach(item->{ System.out.println(item.toUpperCase()); });

        List<String>list2=new ArrayList<>();
//        list.forEach(item->{list2.add(item.toUpperCase());});
//        list2.forEach(item->{ System.out.println(item); });

        //采用Stream方式
//        list.stream().map(item->item.toUpperCase()).forEach(item->{ System.out.println(item); });

        //采用方法的引用
        list.stream().map(String::toUpperCase).forEach(item->{ System.out.println(item); });

    }
}

@FunctionalInterface
interface TheInterface{
    void myMethod();
}

@FunctionalInterface
interface TheInterface2{
    void myMethod2();
}

