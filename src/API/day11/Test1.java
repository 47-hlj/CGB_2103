package API.day11;

//测试  字符串拼接效率
public class Test1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        String string=new String();

        long startTime1=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string+="abcdefghi";
        }
        long endTime1=System.currentTimeMillis();

        long startTime2=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("abcdefghi");
        }
        long endTime2=System.currentTimeMillis();

        System.out.println(endTime1-startTime1);
        System.out.println(endTime2-startTime2);

    }
}
