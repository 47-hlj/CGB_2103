package collection.day14;

import java.util.ArrayList;

//测试 ArrayList接口
public class Test4 {
    public static void main(String[] args) {
//        //1,创建对象
//        //本质上底层会维护一个Object[] elementData,用来存放入ArrayList中的数据
//        //1,jdk1.6,当创建ArrayList对象时,底层会初始化一个数组,默认容量是10.
//        //数据多的时候,超过10个时,会自动扩容:旧容量+旧容量/2
//        //jdk1.8,但是,一开始是空数组.第一次添加数据时才开始扩充容量.
//        ArrayList<String> list = new ArrayList();
//        //2,add被调用时,拿着数据,直接存入了Object[]中.
//        list.add("1");//存入数组里的0下标处
//        list.add("2");//存入数组里的1下标处....
//        list.add("3");
//        list.add("1");
//        list.add(null);
//        //特点::有序 + 有下标 + 可重复
//        System.out.println(list);
//        //2,调用方法
//        //继承自Collection接口的
//        //继承自List接口的
//
//        //TODO 模拟ArrayList
//        //创建对象时,会创建Object数组并初始化
//        Object[] elementData = {};//1.8的写法
//        elementData = new Object[10];//1.6的写法
//        //add()添加数据时,把数据存入数组里
//        elementData[0] = "1";
//        elementData[1] = "2";
//        elementData[2] = "3";
//        elementData[3] = "1";
//        //数据的长度<=10,不会扩容,>10时会自动扩容,是以前的1.5倍
//        elementData = Arrays.copyOf(elementData,15);
//        elementData = Arrays.copyOf(elementData,22);
//
        //TODO 练习:求List里的偶数和,奇数个数,平均值
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<10;i++){
            arrayList.add((int)(Math.random()*100));
        }
        System.out.println(arrayList);
        int num=0,avg=0,sum1=0;
        double sum=0.0;
        for(Integer i:arrayList){
            if(i%2==0)
                sum1+=i;
            else
                num++;
            sum+=i;
        }
        System.out.println("偶数和="+sum1);
        System.out.println("奇数个数="+num);
        System.out.println("平均值="+sum/arrayList.size());

        //TODO 练习:求List里的最大值,最小值
        int max=arrayList.get(0),min=arrayList.get(0);
        for(Integer i:arrayList){
            if(i>=max)
                max=i;
            if(i<=min)
                min=i;
        }
        System.out.println("最大值="+max);
        System.out.println("最小值="+min);

    }
}