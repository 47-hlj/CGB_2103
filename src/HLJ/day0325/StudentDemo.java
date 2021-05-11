package HLJ.day0325;

public class StudentDemo {
    public static void main(String[] args) {
        Student student=new Student();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.addr);

        student.name="hlj";
        student.addr="浙江";
        student.age=21;

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.addr);

        student.eat();
        student.sleep();
        student.study();
    }
}
