package OOP.day09;

public class Test4 {
    public static void main(String[] args) {

    }
}

//第一步.创建父类---设计成抽象类
abstract class Father2{
    //1.抽象方法：没有方法体，被abstract修饰
    //2.如果一个类里包含着抽象方法，那么这个类必须设计成抽象类
    //3.抽象类可以包含抽象方法和普通方法
    abstract public void eat();
    abstract public void game();

}

//第二步.创建子类---继承抽象类
class Son22 extends Father2{
    //2.子类继承了抽象的父类，需要重写所有的抽象方法
    @Override
    public void eat() {
        System.out.println(1);
    }
    @Override
    public void game() {
        System.out.println(2);
    }
}

abstract class Son2 extends Father2{
    /**1.子类继承了抽象的父类，会把抽象方法继承过来，此时，
     * 子类包含着继承来的抽象方法，必须定义一个抽象的子类
     */
}