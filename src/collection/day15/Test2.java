package collection.day15;

import java.util.ArrayList;
import java.util.LinkedList;

//测试ArrayList和LinkedList的查询效率
public class Test2 {
    public static void main(String[] args) {
        method();
        method2();
    }

    public static void method(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long end=System.currentTimeMillis();
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.get(i);
//        }
        System.out.println(end-start);
    }
    public static void method2(){
        LinkedList<Integer> linkedList=new LinkedList<>();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long end=System.currentTimeMillis();
//        for (int i = 0; i < linkedList.size(); i++) {
//            linkedList.get(i);
//        }
        System.out.println(end-start);
    }
}
