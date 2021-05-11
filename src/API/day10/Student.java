package API.day10;

import java.util.Objects;

public class Student {
    //TODO  Fields...
    private String name;
    private  int age;

    //TODO Constructor..
    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //TODo getters ande setters..
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //需要1：打印时，不想打印地址值，而是想要打印属性值--继承Object的toString方法进行重写
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //需求2：比较时，不比较地址值，而是比较属性值
    //如果属性值一样，就是同一个对象，就让equals()返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }
}
