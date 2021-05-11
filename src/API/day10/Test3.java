package API.day10;

import java.util.Arrays;

//测试 String工具类
public class Test3 {
    public static void main(String[] args) {
        //1，创建对象
        String s = new String();//触发无参构造

        char[] value = {'h','e','l','l','o'} ;
        String s2 = new String(value);//存在堆内存，低效

        String s3 = "jack" ;//简写，存在常量池，高效
        s3 = "rose" ;//创建新的字符串

        //2，调用方法
        //		char charAt(int index)
        char a = s2.charAt(0);//根据下标0获取对应的字符h
        System.out.println(a);
        //		String concat(String str)
        String b = s2.concat("123");//拼接字符串
        System.out.println(b);//hello123
        //		boolean endsWith(String suffix)
        boolean c = s2.endsWith("lo");//判断s2是否以"lo"结尾
        System.out.println(c);//true

        //TODO 调用以下方法
        System.out.println( s2.contains("o") );//判断s2是否包含"o"
        System.out.println( s2.endsWith("o") );//判断s2是以"o"结尾
        System.out.println( s2.equals("hello") );//String重写了equals()
        System.out.println( s2.hashCode() );//获取s2在内存中的哈希码值
        System.out.println( s2.indexOf("l") );//获取s2里"l"第一次出现的索引
        System.out.println( s2.lastIndexOf("l") );//获取s2里"l"最后一次出现的索引
        System.out.println( s2.isEmpty() );//判断s2是否为空
        System.out.println( s2.length() );//获取s2的长度
        System.out.println( s2.replace('l','a') );//把旧字符换成新字符
        System.out.println( s2.startsWith("he") );//判断是否以"he"开始
        System.out.println( s2.substring(2) );//从2索引开始截取子串
        System.out.println( s2.substring(1,3) );//从1索引开始，到3结束截取子串[1,3)-含头不含尾
        System.out.println( s2.toLowerCase() );//全转小写
        System.out.println( s2.toUpperCase() );//全转大写
        s2="  a v c ";
        System.out.println( s2.trim() );//去掉多余空格
        System.out.println( s2.matches("abc") );//判断是否匹配
        String x = String.valueOf(100);//把其他类型转成String类型
        System.out.println(x+1);//1001
        byte[] bs = s2.getBytes();//把每个字符对应的数字，存入 byte[]
        //[32, 32, 97, 32, 118, 32, 99, 32]
        System.out.println(Arrays.toString(bs));
        s2="ab1c1d1";
        String[] ss = s2.split("1");//按照规则切割字符串
        System.out.println(Arrays.toString(ss));//[ab, c, d]
        char[] cs = s2.toCharArray();//把字符串里的每个字符存入char[]
        System.out.println(Arrays.toString(cs));//[a, b, 1, c, 1, d, 1]

        //TODO String练习：获取指定字符串里的每个字符
        String m="abcdefghijklmn";
        //方式1：变成char[]，再遍历char[]
        char[] n = m.toCharArray();
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        //方式2：变成byte[]，再遍历byte[]
        byte[] m2 = m.getBytes();
        for (int i = 0; i < m2.length; i++) {
            byte data  = m2[i];
            char n2 = (char)data;//强转，把byte->char
            System.out.println(n2);
        }
        //方式3：直接遍历字符串，获取里面的字符
        for (int i = 0; i < m.length(); i++) {
            char data = m.charAt(i);//根据下标i，获取字符
            System.out.println(data);
        }


    }
}
