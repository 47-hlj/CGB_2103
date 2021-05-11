package day05;

//测试 嵌套for循环
public class Test2 {
    public static void main(String[] args) {
//		method();//打印左直角三角形
        method2();//打印99乘法表
    }
    //打印99乘法表
    public static void method2() {
        for(int i = 1 ; i <= 9; i++) {//外循环控制行
            //内循环控制列，列数在变，不能写死
            for(int j = 1 ; j <= i; j++) {
//				System.out.print("3*2=6");//同行展示
//				System.out.print("i*j=i*j");//同行展示
                System.out.print(i+"*"+j+"="+i*j+"	");//同行展示
            }
            System.out.println();//换行
        }
    }
    //当i=1时,满足了i<=5判断条件,进去执行第三大步int j=1;j<=1,内循环能执行1次,打印*,换行
//当i=2时,满足了i<=5判断条件,进去执行第三大步int j=1;j<=2,内循环能执行2次,打印**,换行
//当i=3时,满足了i<=5判断条件,进去执行第三大步int j=1;j<=3,内循环能执行3次,打印***,换行
//当i=4时,满足了i<=5判断条件,进去执行第三大步int j=1;j<=4,内循环能执行4次,打印****,换行
//当i=5时,满足了i<=5判断条件,进去执行第三大步int j=1;j<=5,内循环能执行5次,打印*****,换行
    public static void method() {
        for(int i = 1 ; i <= 5; i++) {//外循环控制行
            //内循环控制列，列数在变，不能写死
            for(int j = 1 ; j <= i; j++) {
                System.out.print("*");//同行展示
            }
            System.out.println();//换行
        }
    }
}
