package API.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Reg {
    /**
     * [a-zA-Z]:表示字母
     * [0-9]:表示数字
     * \w  :字母数字下划线
     * \d  :数字
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //身份证格式
//        String idCard=scanner.nextLine();
//        String reg="[0-9]{17}[0-9x]";
//        if(idCard.matches(reg)){
//            System.out.println("ok");
//        }else{
//            System.out.println("不是身份证格式");
//        }
        //注册一个密码，包括字母、数字和_组成，要求8-16位
//        String reg="[a-zA-Z0-9_]{8,16}";
//        String pwd=scanner.nextLine();
//        if(pwd.matches(reg)){
//            System.out.println("ok");
//        }else {
//            System.out.println("密码格式错误");
//        }
        //字符串切割
        String reg="[A-Za-z]{1,}";
        String pwd=scanner.nextLine();
        String[] arr=pwd.split(reg);
        System.out.println(Arrays.toString(arr));
//        System.out.println(pwd.matches(reg));
    }
}
