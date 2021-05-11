package HLJ.day0329;

public class Test01 {
    int x;
    public static void change(Test01 t){
        t.x=3;
    }
    public static void main(String[] args) {
        Test01 t=new Test01();
        t.x=5;
        change(t);
        System.out.println(t.x);
    }
}
