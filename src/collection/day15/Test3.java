package collection.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//给List  Set去重
public class Test3 {
    public static void main(String[] args) {
        //TODO  List去重
        //1,准备数据
        ArrayList<Integer> list = new ArrayList();
        Collections.addAll(list,1,2,3,1,3,4,5,6);
        //准备list2存去重后的数据
        ArrayList<Integer> list2 = new ArrayList();
        //2,获取list里的每个数据
        for(Integer data : list){
            //3,判断list2里没有数据才add()
            if(! list2.contains(data)){
                //4,准备加进list2里
                list2.add(data);
            }
        }
        System.out.println(list2);

        //TODO  Set去重
        //1,准备数据
        ArrayList<Integer> list1 = new ArrayList();
        Collections.addAll(list1,1,2,3,1,3,4,5,6);
        //准备Set集合去重
        HashSet<Integer> set = new HashSet();
        //2,获取list里的每个数据
        for(Integer data : list){
            //利用了Set去重的特点
            set.add(data);
        }
        System.out.println(set);
    }

}
