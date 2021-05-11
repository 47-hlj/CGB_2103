package HLJ.day0322;

//switch-case
public class Demo05 {
    public static void main(String args[]){
        /*
        支持数据类型byte、short、int、String、char
        String:JDK1.7(包含)坂本支持字符串,版本问题
        Enum:JDK1.5版本支持

        default不需要break

        关键字break
         */
        int num=1;
        switch (num){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("明天星期二");
                break;
            case 3:
                System.out.println("后天星期三");
                break;
            case 4:
                System.out.println("大后天星期四");
                break;
            default:
                System.out.println("程序运行结束");
        }
    }
}
