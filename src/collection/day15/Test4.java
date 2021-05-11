package collection.day15;

import java.util.HashSet;
import java.util.TreeSet;

//测试  HashSet实现类
public class Test4 {
    public static void main(String[] args) {
        //1.创建对象
        //HashSet创建对象时，在底层创建了HashMap；
        HashSet<Integer> hashSet=new HashSet<>();
        //当向set中添加数据时，本质拿着数据存入了HashMap中
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(null);
        hashSet.add(null);
        //特点：去重，可以存一个null  无序
//        int[] a=new int[hashSet.size()];
//        int[] b=(int[])hashSet.toArray(a);
         //2.调用方法

        //TreeSet会按照自然升序排序,与字母大小写无关
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("jack");
        treeSet.add("jreey");
        treeSet.add("jack");
        treeSet.add("abc");
        treeSet.add("1230");
        treeSet.add("130");
        treeSet.add("234");
        treeSet.add("abd");
        treeSet.add("b");
        System.out.println(treeSet);

    }
}
