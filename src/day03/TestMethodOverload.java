package day03;

/**本类用于测试方法的重载*/
public class TestMethodOverload {
    public static void main(String[] args) {
        /**1.我们根据方法名+参数列表确定具体调用哪个方法*/
        /**2.方法的重载:
         * 在同一个类中,存在方法名相同,但参数列表不同的方法
         * 如果在同类中,同名方法的参数个数不同,一定构成重载
         * 如果在同类中,同名方法的参数个数相同,
         * 需要查看对应位置上参数的类型,而不是参数名,与参数名无关
         * (int a,String b)与(int b,String a)--不构成重载
         * (int a,String b)与(String a,int b)--构成重载
         * */
        //2.调用method()
        method();
        //4.调用method(int)
        method(666);
        //6.调用method(int,String)
        method(888,"泡泡");
    }

    //1.创建一个无参的method()
    public static void method() {
        System.out.println("哈哈哈哈我没参数");
    }
    //3.创建一个method(int n)
    public static void method(int n) {
        System.out.println("哈哈哈哈我的参数是:"+n);
    }
    //5.创建一个method(int n,String s)
    public static void method(int a,String b) {
        System.out.println(b+"今晚要干他"+a+"碗大米饭");
    }
    public static void method(String a,int b) {
        System.out.println(b+"今晚要干他"+a+"碗大米饭");
    }
}
