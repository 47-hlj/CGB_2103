package map.day16;

import java.util.HashMap;

/**
 * 1.当new HashMap()时，底层会开辟空间（）大小16，使用默认的加载因子时0.75
 * 2.开始准备存数据段，必计算存放位置--hash(key)
 * 3.判断如果位置是null，就是没存放过数据，直接存就行了
 * 4.判断如果位置存放过数据，就形成链表
 *     --key不相同，会形成链表
 *     --key相同，覆盖旧的value
 * 5.当达到12(16*0.75)的时候，就开始rehash，新桶的容量是以前的2倍
 * 6.JDK1.8之后，当容量大于64，链表长度大于8时，则转换为红黑树进行存储
 *   当红黑树长度小于6的时候，则转为链表进行存储
 * 7.如果发生哈希碰撞，JDK1.8之前使用头插法，JDK1.8之后改为尾插法
 */
//测试 HashMap
public class Test1 {
    public static void main(String[] args) {
        //1,创建对象
        //使用默认的加载因子0.75(可以达到的阈值),使用默认的容量16(桶的大小)
        HashMap<Integer,String> map = new HashMap();
        //存数据时,先算位置.hash(key).
        //判断,如果这个位置没存过数据是null的话,就把数据直接存入Node[] tab数组中
        //判断,如果这个位置存过数据,会形成链表  p.next=newnode;
        map.put(100,"jack");
        map.put(20,"rose");
        map.put(15,"tony");
        map.put(20,"jerry");
        map.put(30,"tommy");
        System.out.println(map);
        //TODO 2,调用方法
        //TODO 迭代Map集合
    }
}