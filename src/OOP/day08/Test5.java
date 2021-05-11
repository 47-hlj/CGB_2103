package OOP.day08;

public class Test5 extends  Object{

    public static void main(String[] args) {
        // 创建对象测试
        Person p=new Person();
        p.eat();
        System.out.println(p.age);
        p.sleep();
        System.out.println(p.name);
        //1.static的资源，可以通过对象访问+类名访问
        Person.sleep();
        System.out.println(Person.name);
        Person p1=new Person();
        p1.name="快乐星球";
        System.out.println(p1.name);
        Person p2=new Person();
        System.out.println(p2.name);
        Person p3=new Person();
        System.out.println(p3.name);
        Person p4=new Person();
        System.out.println(p4.name);
    }
}

class Person{
    // 普通资源
    int age=10;
    public void eat(){
        System.out.println(1);
    }
    // 静态资源
    /**1.static 可以修饰 成员变量和方法
     * 2.static 资源优先于对象加载
     * 3.static 资源是共享的，可以直接被类名调用
     * 4.静态只能调用静态，非静态可以随意调用
     */
    static String name="tony";
    static public void sleep(){
        //4.静态只能调用静态，非静态可以随意调用
//        System.out.println(age);
        System.out.println(name);
        System.out.println(1);
    }

}
