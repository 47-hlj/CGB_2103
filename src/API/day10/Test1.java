package API.day10;

//测试 Object工具类
public class Test1 {
    public static void main(String[] args) {
        //1.创建对象
        Object o=new Object();
        //2.调用方法
        /**
         * String toString()  返回该对象的字符串表示
         * boolean equals(Object obj)   指示其他某个对象是否与此对象“相等”
         * 使用了==进行比较
         * ==比较基本类型，直接比较值本身
         * ==比较引用类型，直接比较地址值
         * int hashCode()     返回该对象的哈希码值
         */
        System.out.println(o.toString());//java.lang.Object@6d6f6e28
        System.out.println(o.hashCode());//1836019240
        System.out.println(o.equals("jack"));//false


    }
}
