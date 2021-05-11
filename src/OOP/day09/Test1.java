package OOP.day09;

//测试   多态

/**
 * 总结：
 * 1.父类引用指向子类对象
 * 2.编译看左边，运行看右边
 * 3.重写看实例，否则看引用
 */

public class Test1 {
    public static void main(String[] args) {
        //创建子类对象测试
        Dog d=new Dog();
        d.eat();

        //创建多态对象---父类引用  指向   子类对象---只能用父类的功能
        Animal a=new Dog();//通用性/ 统一调用标准
        System.out.println(a);
        //编译看左边，运行看右边
        //调用父类的eat()---统一调用标准，向父类看齐
        a.eat();//调用父类的方法声明，使用了子类的方法体
        System.out.println(a.age);//调用父类的
//        System.out.println(a.name);//多态对象不支持用子类的name

        //TODO 专门使用子类的扩展的资源？--不能用多态的对象
        //1，直接创建子类对象
        Dog d2 = new Dog();
        System.out.println(d2.name);
        //2，向下造型
        Animal a2 = new Dog();//向上造型
        Dog d3 = (Dog) a2;//向下造型
        System.out.println(d3.name);
        //TODO 向上造型和向下造型的区别？
        //向上造型是多态，为了统一调用的标准，提高通用性
        //向下造型是为了使用子类的扩展的资源
    }
}

//1.创建父类---提取子类的所有共性代码，提高了复用性
class Animal{
    int age=10;
    public void eat(){
        System.out.println("啥都吃");
    }
}

//2.创建子类---可以使用父类的功能，减少子类的代码量
class Dog extends Animal{
    String name="hlj";
    //3.当子类需要改父类原来的功能时，扩展性
    @Override  //重写方法的标记--注解
    public void eat(){
        System.out.println("狗吃肉");
    }
}
