package collection.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//集合的工具类Collections -- addAll/max/min
public class Test5 {
    public static void main(String[] args) {
        //        method(); //TODO 练习:求List里的最大值,最小值
        method2();//TODO 练习:求List里的偶数和,奇数个数,平均值
    }
    //TODO 练习:求List里的偶数和,奇数个数,平均值
    public static void method2() {
        List<Integer> list = new ArrayList<>();
        //利用工具类，一次性向集合中添加一批数据
        Collections.addAll(list,1,42,51,19,74,89,56);
        //迭代集合 foreach
        int sum = 0 ;//定义变量，记录偶数和
        int count = 0 ;//定义变量，记录奇数个数
        int all = 0 ;//定义变量，记录总和
        for(Integer data : list){
            all = all + data ;//求所有数的和
            if(data % 2 == 0) {//过滤偶数
                sum = sum+data;//求和
            }
            if(data % 2 == 1) {//过滤奇数
                count++;//个数+1
            }
        }
        System.out.println("偶数和是："+sum);
        System.out.println("奇数个数是："+count);
        System.out.println("平均数是："+ all/list.size() );
    }
    //TODO 练习:求List里的最大值,最小值
    public static void method() {
        List<Integer> list = new ArrayList<>();
        //利用工具类，一次性向集合中添加一批数据
        Collections.addAll(list,1,4,2,6,74,89,56);
        //利用工具类，max()获取最大值,min()最小值
        Integer max = Collections.max(list);
        System.out.println(max);
        System.out.println(Collections.min(list));

        Collections.sort(list); //sort()升序排序
        //[1, 2, 4, 6, 56, 74, 89]
        System.out.println(list);
    }
}