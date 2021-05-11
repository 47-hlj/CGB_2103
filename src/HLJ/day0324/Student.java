package HLJ.day0324;

import java.util.Objects;

public class  Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写equals方法
//    @Override
//    public boolean equals(Object o) {
//        Student other=(Student)o;
//        if(this.name.equals(other.name)){
//            if(this.age==other.age)
//                return true;
//       }
//        return false;
//    }

//    @Override
//    public boolean equals(Object o) {
//        Student other=(Student)o;
//        return this.name.equals(other.name)&&this.age==other.age;
//    }

/*
如果地址值相等，说明是同一个对象，直接true，没必要转型比较
 */
//    @Override
//    public boolean equals(Object o) {
//        if(this==o)
//            return true;
//        Student other=(Student)o;
//        return this.name.equals(other.name)&&this.age==other.age;
//    }


    //instanceof关键字
    //判断前者是否是后者的对象
    //如果传过来的是其他类型的对象，直接false
    @Override
    public boolean equals(Object o) {
        if(this==o)
            return true;
        if(!(o instanceof Student))
            return false;
        Student other=(Student)o;
        return this.name.equals(other.name)&&this.age==other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
