package OOP.day08;
//测试  继承里的方法

/**
 * 总结：
 *1.子类继承父类后，可以使用父类的所有方法(除了private的)
 * 还可以扩展自己的方法
 * 还可以修改继承来的方法---进行方法重写
 * 重写要求：可见性大于等于+子类的方法申明/签名，必须和父类一样
 * 2.方法重写，影响子类的方法体，但对父类不产生影响
 * 3.开发时的原则：开闭原则(OCP)----关闭源码修改----开放功能扩展
 */
public class Test2 {
    public static void main(String[] args) {
        Zi2 z=new Zi2();
        z.eat();//重写前，使用父类的；重写后，使用子类的
        //z.play();//是父类的私有资源，只能在服了中使用
        z.coding();//使用子类的扩展
    }
}
class Fu2{
    public void eat(){
        System.out.println("啥都吃");
    }
    private void paly(){
        System.out.println("啥都玩");
    }
}

//1.子类继承父类后，可以使用父类的所有方法(除了private的)
class Zi2 extends Fu2{
    //2.子类除了能用父类的，还可以自己扩展
    public void coding(){
        System.out.println("敲代码");
    }

    /**3.子类除了能用父类的，还可以自己扩展，还可以改--方法重写
     * 要求：子类要有足够的权限+方法声明和父类一样
     * 返回类型：基本数据类型一致，引用类型小于等于
     * 可见性：大于等于 public>protected>default>private
     * 异常：小于等于
     */
    @Override
    public void eat() {
        super.eat();//验证：重写后，对怨恨你来父类的功能----没有，遵循ocp(开闭原则)
        System.out.println("吃猪肉");
    }

}