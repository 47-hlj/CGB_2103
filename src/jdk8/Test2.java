package jdk8;

import java.util.Arrays;

// 函数式接口和Lambda表达式
@FunctionalInterface
interface MyInterface {
    void test();

//    String MyString();

    String toString();//继承自Object
}

public class Test2 {
    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }
    public static void main(String[] args) {
        Test2 test2=new Test2();

//        test2.myTest(new MyInterface() {
//            @Override
//            public void test() {
//                System.out.println("mytest");
//            }
//        });

        //使用Lambad表达式
        test2.myTest(()->{
            System.out.println("mytest");
        });

        System.out.println("-------------------");

        MyInterface myInterface=()->{
            System.out.println("hello");
        };

        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(Arrays.toString(myInterface.getClass().getInterfaces()));
    }
}
