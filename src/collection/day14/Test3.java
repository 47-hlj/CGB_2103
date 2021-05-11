package collection.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();


        //2.调用方法
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(100);
        list.add(200);
        list.add(null);
        list.add(null);
        System.out.println(list);//[100, 200, 300, 100, 200, null, null]

        list.add(0,10);
        System.out.println(list);//[10, 100, 200, 300, 100, 200, null, null]

        System.out.println(list.get(3));//300

        System.out.println(list.indexOf(200));//2

        System.out.println(list.lastIndexOf(200));//5

        System.out.println(list.remove(1));//100
        System.out.println(list);//[10, 200, 300, 100, 200, null, null]

        System.out.println(list.set(5,666));//null
        System.out.println(list);//[10, 200, 300, 100, 200, 666, null]

        List<Integer> list2=list.subList(2,6);
        System.out.println(list2);//[300, 100, 200, 666]

        //移除指定的元素
        //[10, 200, 300, 100, 200, 666, null]
//        System.out.println(list.remove(2));
        System.out.println(list.remove(new Integer(300)));//装箱
        System.out.println(list);

        //遍历list
        //1.继承字符接口的方法Iterator<E> iterator
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //2.List有小标，根据下标遍历for
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //3.foreach
        for (Integer i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
        //4.List子接口的扩展方法ListIterator<E> 能正反遍历
        ListIterator<Integer> listIterator=list.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        //逆向遍历(必须先顺序遍历)
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
        System.out.println();
    }
}
