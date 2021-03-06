package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 函数式接口和Lambda表达式
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------");
        for (Integer i:list){
            System.out.println(i);
        }
        System.out.println("-----------------------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("----------------------");
        list.forEach((i)->{
            System.out.println(i);
        });

        System.out.println("----------------------");
        //方法引用
        list.forEach(System.out::println);

    }
}
