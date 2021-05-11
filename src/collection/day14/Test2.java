package collection.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {

        //1.创建对象
        Collection<Integer> collection = new ArrayList();

        //2.调用方法
        collection.add(100);//自动装箱
        collection.add(200);
        collection.add(300);
        System.out.println(collection);

        System.out.println(collection.contains(200));

        System.out.println(collection.contains("jack"));

        System.out.println(collection.equals("jack"));

        System.out.println(collection.hashCode());
        System.out.println(collection.isEmpty());
        System.out.println(collection.remove(200));
        System.out.println(collection);
        System.out.println(collection.size());

        Object[] o=collection.toArray();
        System.out.println(Arrays.toString(o));

        //迭代集合中的元素
        //方式1：Iterator<E> iterator()
        Iterator<Integer> it=collection.iterator();
        while(it.hasNext()){//hasNext()判断有没有数据
            //获取数据
            Integer data=it.next();
            System.out.println(data);
        }
        //方式2：foreach循环
        for (Integer i:collection) {
            System.out.println(i);
        }

        Collection<Integer> collection1=new ArrayList<>();
        collection1.add(300);
        collection1.add(400);
        collection1.add(500);


        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println(collection.containsAll(collection1));
        collection.removeAll(collection1);//移除collection1和collection的交集
        System.out.println(collection);
        System.out.println(collection.retainAll(collection1));//保留collection1和collection的交集
        System.out.println(collection);
    }
}
