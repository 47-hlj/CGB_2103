package Inner;

public class Test3{
    public static void main(String[] args) {
        AAA a=new AAA(){
            @Override
            public void show() {
                System.out.println(321);
            }
        };
        a.show();
        a.test();
    }
}

abstract class AAA{
    abstract public void show();
    public void test(){
        System.out.println(123);
    }
}
