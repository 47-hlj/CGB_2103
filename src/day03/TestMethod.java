package day03;

/**本类用于测试方法*/
public class TestMethod {
    //1.创建程序的入口函数main()
    public static void main(String[] args) {
        System.out.println(1);
        /**2.我们通过方法名+参数列表的方式来调用方法的功能*/
        method1();//调用method1()
        System.out.println(2);
        method2(3);//调用method2()
        int result = method3(1,2);//调用method3()
        System.out.println(result);

        String x=method4(1,2,"3");//调用method4
        System.out.println(x);
    }

    /**3.如果方法想要返回值,必须修改返回值类型
     * 并且return对应类型的结果
     * 如果方法的返回值类型是void,不允许有返回值
     * */
    /*本方法用来测试方法的返回值类型*/
    public static int method3(int i, int j) {
        /**4.通过return关键字将方法结果返回到调用位置*/
        return i+j;
    }

    /**1.方法的修饰符 方法的返回值类型 方法名(方法参数){方法体}*/
    /*method1()想测试方法的调用顺序*/
    public static void method1() {
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
    }

    /*本方法用来测试方法的参数,参数的位置在小括号里*/
    public static void method2(int a) {
        System.out.println("海绵宝宝今年:"+ a +"岁啦~");
    }

    public static String method4(int i, int j, String str){
        return i+""+j+str;
    }
}
