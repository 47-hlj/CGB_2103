package API.day11;

//测试  包装类
public class Test4 {
    public static void main(String args[]){
        //1.创建对象----把基本类型变成包装类型
        Integer integer=new Integer(5);

        //2.调用方法
        int a= integer.intValue();//把包装类型变成基本类型
        System.out.println(a);

        String string="12143124";
        System.out.println(Integer.parseInt(string));//把字符串转换为基本类型

        Integer integer1=Integer.valueOf(5);
    }
}
