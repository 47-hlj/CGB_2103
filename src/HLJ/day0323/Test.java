package HLJ.day0323;


//while循环练习——1+1/2+···+1/13
public class Test {
    public static void main(String[] args) {
        /*
        数据类型转换
        隐式转换：小转大
                 byte->short->int->long->float->double
                 char->int
        显示转换：强制类型转换

         */
        double i=1.0;
        double sum=0.0;
        while(i<=13){
            sum+=1.0/i;
            System.out.println(i);
            i++;
        }
        System.out.println(sum);
    }
}
