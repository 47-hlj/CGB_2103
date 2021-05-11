package day05;

//测试 break和continue
public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 0) {//过滤偶数
                //1，break和continue都必须出现在循环结构中
                System.out.println(i);
//				break;//立刻结束
                continue;//结束这次,还能继续
                //2，break和continue之后不能再出现代码，否则是不可到达的代码
            }
        }
    }
}
