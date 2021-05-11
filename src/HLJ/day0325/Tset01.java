package HLJ.day0325;

public class Tset01 {
    static int aa;
    public static void main(String[] args) {
        System.out.println(aa);
        String s="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();

        long start=System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sb.append(s);
        }
        long end=System.currentTimeMillis();

        System.out.println(end-start);
    }
}
