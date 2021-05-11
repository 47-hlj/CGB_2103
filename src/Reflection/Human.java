package Reflection;

public class Human {
    //TODO Fields
    public String name;
    private int age;
    double salary;

    //TODO Constructor
    public Human() {
    }
    public Human(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void test1(){
        System.out.println("执行test1方法");
    }

    private void test2(String a ){
        System.out.println(a);
    }

    //TODO Methods
    public void test3(int a){
        System.out.println(a);
    }

}
