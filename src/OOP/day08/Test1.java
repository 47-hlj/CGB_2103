package OOP.day08;

public class Test1 {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.show();
    }
}


class Fu{
    String name="jack";
}

class Zi extends Fu{
    int age=20;//成员变量
    String name="rose";
    public void show(){
        int age=10;//局部变量
        System.out.println(age);//10,就近原则，优先使用局部变量
        System.out.println(this.age);//20，this调用本类的成员变量
        System.out.println(name);//使用了子类的资源rose
        /**使用父类的资源jack
         * 1.super代表父类对象的引用。  Fu super =new Fu();
         * 2.super用在子类中，调用父类的功能
         */
        System.out.println(super.name);//使用super，调用父类的资源jack
    }
}
