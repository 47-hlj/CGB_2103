package map.day15;

//测试 Map   与Collection同级

import java.util.*;

/**
 * Map<K,V>键值对
 *特点
 * 无序   key不能相同  相同时value被覆盖
 */
public class Test1 {
    public static void main(String[] args) {
        //1.创建对象
        Map<Integer,String> map=new HashMap<>();

        map.put(9527,"唐伯虎");
        map.put(9528,"如花");
        map.put(9525,"秋香姐");
        map.put(9520,"石榴姐");
        map.put(9520,"华夫人");
        System.out.println(map);//{9527=唐伯虎, 9528=如花, 9720=华夫人, 9725=秋香姐}

        //2.调用方法
//        map.clear();
        System.out.println(map.containsKey(9520));//true
        System.out.println(map.containsValue("唐伯虎"));//true
        System.out.println(map.equals("唐伯虎"));//false

        System.out.println(map.get(9527));//唐伯虎
        System.out.println(map.hashCode());//74760819
        System.out.println(map.isEmpty());//false
        System.out.println(map.remove(9528));//华夫人
        System.out.println(map);//{9520=华夫人, 9525=秋香姐, 9527=唐伯虎}
        System.out.println(map.size());//3

        //迭代Map集合里的数据{9520=华夫人, 9525=秋香姐, 9527=唐伯虎}
        //方式1：Set<K> keySet()---把所有key获取到并存入set
        Set<Integer> keys=map.keySet();//把所有key存入set里
        for(Integer k:keys){//迭代set，得到每个key
            //拿到k对应的value
            String v =map.get(k);
            //判断取到的value和"秋香姐"是否相等
            if(v.equals("秋香姐")){
                System.out.println(v+",加个微信不喽~");
            }
            System.out.println(k+"="+v);
        }

        //方式2：Collection<E> values()---只能把map里的所有value取出来，key取不出来
        Collection<String> values=map.values();
        for(String v:values){
            System.out.println("v="+v);
        }

        //方式3：Set<Map.Entry<K,v>> entrySet()
               //把map里的数据的key和value都获取到并封装成Entry存入se中
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for(Map.Entry entry:entrySet){//迭代Set得到每个Map.Entry
            //再获取entry封装着的key和value
            System.out.println(entry.getKey()+"="+entry.getValue());
//            System.out.println(entry);
        }

        method();
    }

    //TODO  Map的练习，统计用户输入的字符串中的每个字符出现的次数
    /**
     * Map<Character,Integer>
     */
    public static void method(){
        String string=new Scanner(System.in).nextLine();
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else {
                map.put(c,map.get(c)+1);
            }
        }
        System.out.println(map);
    }
}
