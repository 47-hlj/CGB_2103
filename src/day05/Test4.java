package day05;

//测试 死循环
public class Test4 {
    public static void main(String[] args) {
        //TODO 死循环的不同写法
//		for(int i = 1;i > 0 ;i++) {
//		for(;;) {
//		while(true){
//			System.out.println(1);
//		}
        //TODO while和do...while的区别
        int i = 10;
//		while(i > 10){//先判断再执行
//			System.out.println(1);
//		}
        do {//先执行再判断
            System.out.println(1);//保证循环体最少执行1次
        }while(i > 10);

        //TODO 假设你有1个亿,一天花一半,能花多少天
        int money = 100000000 ;//定义变量,记录钱
        //定义变量,记录天数
        int day = 0;
        while(money>0) {
            //一天花5000000,并修改变量的值
            money = money-5000000;
            day++;//统计天数
        }
        System.out.println("能花: "+day+"天.");//20
    }
}
