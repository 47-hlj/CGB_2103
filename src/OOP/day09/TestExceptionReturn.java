package OOP.day09;

//测试 try-catch-finally带有return的执行顺序
/**
 * 总结：
 * try-catch部分带有return语句
 * 先执行完return语句之前的代码再执行finally代码部分
 * finally部分执行结束返回try-catch部分的return结束
 * 如果finally中带有return就直接结束，不会返回try-catch部分
 */

public class TestExceptionReturn {
    public static void main(String[] args) {
        System.out.println(method());
    }

    private static int method() {
        try{
            System.out.println(100);
            System.out.println(1/0);
            return 1;
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println(200);
            return 2;
        }finally {
            System.out.println(300);
            return 3;
        }
    }


}
