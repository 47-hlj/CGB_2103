package OOP.day10;

public class Test3 {
    public static void main(String[] args) {
        //多态对象
        Object a =new Impl();//只能调用object里的方法
        Impl impl=(Impl) a;//向下造型
        A1 b = new Impl();//只能调用A1里的方法
        A2 c = new Impl();//只能调用A2里的方法
    }
}

interface A1{
    void save();
}
interface A2{
    void get(int id);
}

//1.接口突破了java单继承的局限性。接口间可以发生多继承
interface A3 extends A1,A2{
    void del();
}

//2.实现类和接口是 实现关系，可以多实现
//必须重写 所有抽象方法，否则就是一个抽象类
class AImpl implements A1,A2,A3{
    @Override
    public void save() { }
    @Override
    public void get(int id){ }
    @Override
    public void del() { }
}

//3.实现类可以继承的同时 多实现
//实现类必须重写所有的抽象方法，否则是抽象类
//先继承后实现
class Impl extends Object implements A1,A2{
    @Override
    public void save() { }
    @Override
    public void get(int id) { }
}