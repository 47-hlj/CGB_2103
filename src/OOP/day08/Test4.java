package OOP.day08;

public class Test4 {
    public static void main(String[] args) {

    }
}
class Fu4{
    public Fu4(int a) {//2.有含参构造方法，默认的无参构造方法不存在
        System.out.println(1);
    }

    int age=10;

    public void eat(){
        System.out.println(1);
    }
}

class Zi4 extends Fu4{
    public Zi4() {
//        super();//1.是隐藏着的，会自动调用父类的无参构造
        super(100);//3.只能调用父类的含参构造
    }

    //5.重写：有权限+方法申明和父类一样
    public void eat(){
        System.out.println(100);
    }

    public void show(){
        //4.通过super调用了父类的成员变量
        System.out.println(super.age);
    }
}
