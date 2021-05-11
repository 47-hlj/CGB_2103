package collection.day15;

//测试   LinkedList

import java.util.Collections;
import java.util.LinkedList;

/**
 * ArrayList、LinkedList的区别
 * ArratList----底层是数组，是连续空间，适合查询业务
 * Object[] elementData:10  如果容量不够，按1.5倍自动扩容
 * <p>
 * LinkedList----底层是链表结构，适合增删业务
 */

//测试 LinkedList
public class Test1 {
    public static void main(String[] args) {
        //1,创建对象
        LinkedList<Integer> list = new LinkedList();
        //2,调用方法
        //        继承自Collection接口的方法们
        //        继承自List接口的方法们
        //        扩展的方法们
        Collections.addAll(list,1,2,3,4,5,1,2,3,null);
        System.out.println(list);
        System.out.println(list.get(0));

        list.addFirst(100);//添加首元素
        list.addLast(200);//添加尾元素
        System.out.println(list);
        System.out.println( list.getFirst() );//获取首元素
        System.out.println( list.getLast() );//获取尾元素
        System.out.println( list.removeFirst() );//删除首元素
        System.out.println( list.removeLast() );//删除尾元素
        //TODO 另一套API
        //        boolean offerFirst(E e)
        //        boolean offerLast(E e)
        //        E peekFirst()
        //        E peekLast()
        //        E pollFirst()
        //        E pollLast()
    }
}