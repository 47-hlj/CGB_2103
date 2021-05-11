package HLJ.day0323;


//死循环
public class Demo02 {
    public static void main(String[] args) {
        /*
        死循环
        boolean表达式一直为true
        可用break跳出
         */
        int a =10;

        while(a>0){
            System.out.println("根本停不下来！");
        }
    }
}
