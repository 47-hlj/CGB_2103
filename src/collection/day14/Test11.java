package collection.day14;

import java.util.ArrayList;
import java.util.List;

//测试   泛型
public class Test11 {
    public static void main(String[] args) {
        //1. 不用泛型约束元素的类型集合---集合可以存各种类型的数据
        List list=new ArrayList();
        list.add(1);
        list.add(1.1);
        list.add("jack");
        list.add(true);
        list.add(new Object());
        list.add('我');
        System.out.println(list);

        //2.用泛型约束元素类型的集合---用泛型
        List<String> list2=new ArrayList<>();
        list2.add("jack");
        //泛型的作用：可以约束集合中元素的类型，如果怨恨尿素没通过泛型的类型检查，直接报错
        //list2.add(10);
        list2.add("rose");

        //TODO 给list3里添加整数
        //泛型中间写的不能是基本类型，必须是引用类型
        List<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        //TODO 泛型明明约束的Integer，为什么基本类型也不报错
        //自动装箱  自动拆箱
        list3.add(new Integer(1));
//        list3.add("dsad");
        System.out.println(list3);
    }
}
