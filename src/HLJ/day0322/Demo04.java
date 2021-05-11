package HLJ.day0322;

//三目表达式
public class Demo04 {
    public static void mian(String args[]){
        /*三目表达式
        boolean表达式 ? 表达式1 : 表达式2
        boolean表达式=true ——>表达式1
        boolean表达式=false——>表达式2
         */
        int a=10;
        int b=3;
        int d=40;
        //int c=a>b?80:40;
        int c=a>b ? a>d ? 80:60:40;
        System.out.println(c);
    }
}
