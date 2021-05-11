package day04;

//测试 循环结构
public class Test4 {
    public static void main(String[] args) {
//		method();//练习1：打印100次自己的名字
//		method2();//练习2：打印0~10
//		method3();//练习3：打印10~0
//		method4();//练习4：打印8,88,888,8888
        method5();//练习5：求[1,100]里偶数的和
        //TODO 求[1,100]里奇数的和
        //TODO 求[1,100]里所有数的总和
        //TODO 求[1,100]里偶数的个数
    }
    //练习5：求[1,100]里偶数的和
    public static void method5() {
        int sum = 0 ;//1,定义变量,记录总和
        //2,获取1~100里的每个数字
        for(int i = 1 ; i <= 100 ; i++) {
            if(i % 2 == 0) {//3,过滤偶数
                sum = sum + i ;//4,求和--原来的值+新的值
            }
        }
        System.out.println("偶数的总和是: "+sum);
    }
    //练习4：打印8,88,888,8888,
    public static void method4() {
//		for(开始位置 ; 循环条件 ; 更改条件 ){重复执行的代码 / 循环体}
        for(int i = 8 ; i <= 8888 ; i=i*10+8 ){
            System.out.print(i+",");//同一行打印
//			System.out.println(i);//打印后换行
        }
    }
    //练习3：打印10~0
    public static void method3() {
//		for(开始位置 ; 循环条件 ; 更改条件 ){重复执行的代码 / 循环体}
        for(int i = 10 ; i >= 0 ; i-- ){
            System.out.println(i);
        }
    }
    //练习2：打印0~10
    public static void method2() {
//		for(开始位置 ; 循环条件 ; 更改条件 ){重复执行的代码 / 循环体}
        /*
         * int i = 0 是指从0开始打印，i表示要打印的数据
         * i <= 10 是指打印的数据最多到10就结束
         * i++ 是数据变化的规律。自增
         */
        for(int i = 0 ; i <= 10 ; i++ ){
            System.out.println(i);
        }
    }
    //练习1：打印100次自己的名字
    public static void method() {
//		for(开始位置 ;循环条件;更改条件) {
        /*int i = 1 是开始位置，指从第1次开始打印，i表示次数
         * i <= 100 是循环条件，指到100次结束
         * i++ 是更改条件，也就是数据的变化规律，次数自增
         */
        for(int i = 1 ; i <= 100 ; ++i) {
            System.out.println("我叫胡李江");
        }
    }
}
