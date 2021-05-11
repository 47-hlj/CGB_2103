package day04;

//测试 分支结构
public class Test3 {
    public static void main(String[] args) {
        //1,判断条件，只支持int byte short char String类型的数据
        int a = 200;
        switch(a) {
            case 0: System.out.println(0);break;
            case 1: System.out.println(1);break;
            //2，当成功匹配到了case之后，要向后穿透所有的case
            case 2: System.out.println(2);break;//4，立刻结束
            case 3: System.out.println(3);break;
            case 4: System.out.println(4);break;
            //3,default是无论什么时候都会执行(如果没遇到break的话)
            default : System.out.println(100);
        }
    }
}
