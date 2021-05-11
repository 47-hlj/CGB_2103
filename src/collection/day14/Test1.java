package collection.day14;

//测试   泛型的通用性
public class Test1 {
    public static void main(String[] args) {
        //1.打印数组里的数据
        String[] a={"杨幂","周笔畅","Anglelababa","迪丽热巴","刘沛霞"};
        print(a);
        Integer[] b={1,2,3,4,5};
        print(b);
    }

    public static void print(String[] a){
        /**
         * 增强型for循环----遍历数组和集合
         * for(1  2:3){}
         * 1:遍历得到的数据的类型
         * 2：循环体中要使用的变量名
         * 3：要遍历的
         */
        for(String s:a){
            System.out.println(s);
        }

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
    }

    public static void print(Integer[] a){
        for (Integer i:a) {
            System.out.println(i);
        }
    }

    //泛型方法：返回类型前+参数列表
    public static <E> void print(E[] a){
        for(E e:a){
            System.out.println(e);
        }
    }
}
