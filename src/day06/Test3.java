package day06;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        method();//toString方法
        method2();//sort方法
        method3();//copyOf方法
    }


    //toString()
    public static void method(){
        //1.创建数组
        String[] str={"迪丽热巴","杨幂","皮皮虾"};

        //2.查看数组里的数据
        System.out.println(str);//数组的地址值

//        Arrays.sort(str);
//
//        System.out.println(Arrays.toString(str));

        for (int i = 0; i < 3; i++) {
            System.out.println(str[i]);
        }

        System.out.println(Arrays.toString(str));//借用数组工具类Arrays的同String方法
    }

    //sort()
    public static void method2(){
        //1.创建数组
        int[] a={5,3,1,2,8,6};
        //2.排序--默认升序
        Arrays.sort(a);
        //3.打印
        System.out.println(Arrays.toString(a));
        //获取数组中的最小值和最大值
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
    }

    //实现获取数组的最大值和最小值

    //copyOf()
    public static void method3(){
        //1.创建数组
        int[] a={5,3,1,2,8,6};
        //复制-copyOf(1,2)-1是原数组名-2是新长度
        int[] b=Arrays.copyOf(a,10);

        System.out.println(Arrays.toString(b));

        int[] c = Arrays.copyOf(a,3);

        System.out.println(Arrays.toString(c));
    }

}
