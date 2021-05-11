package Reflection;


//测试 反射
public class Person {
    //TODO Fileds --getFields()
    public String name;
    public int age;
    //TODO Constructors--getConstructors()
    public Person() {  }
    public Person(String name) {
        this.name = name;
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //TODO Methods--getMethods()
    public void show(int a,String b){
        System.out.println(a);
        System.out.println(b);
    }
    public void test(){
        System.out.println(2);
    }
}
