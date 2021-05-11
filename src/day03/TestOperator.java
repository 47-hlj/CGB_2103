package day03;

/**本类用于测试取余和自增自减运算符*/
public class TestOperator{
    //0.创建入口函数
    /**main Alt+/补全代码,Ctrl+s保存 Ctrl+F11执行*/
    public static void main(String[] args) {
        /**四则运算 + - * / */
        /**syso Alt+/补全代码*/
        //2.测试一下除法与取余数%
        System.out.println(25/10);//int/int->int,商是2
        System.out.println(25 % 10);//模,求余数

        //3.测试一下自增自减运算符
        /**前缀式,符号在前,先变换,再使用 ++a --a
         *    后缀式,符号在后,先使用,再变化 a++ a--
         * ++:加1  --:减1
         * */
        int a = 1;
        System.out.println("*************");
        System.out.println(a++);//打印结果是1,打印完以后再变化,自增成2
        System.out.println(a);
        int b = 1;
        System.out.println(++b);//打印结果是2,因为符号在前,先自增

        int c = 1;
        System.out.println(c--);//打印结果是1,符号在后,先打印,再自减
        System.out.println(c);//自减过后变成了0

        int d = 1;
        System.out.println(--d);//打印结果是0,符号再前,先自减再打印

        //因为受之前代码的影响,c的初始值是0
        System.out.println(--c-c-c--);//-1-(-1)-(-1)=-1+1+1=1
        System.out.println(c);//-2
    }
}
