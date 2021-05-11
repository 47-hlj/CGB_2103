package HLJ.day0324;

//对象比较==和equals
public class Demo01 {
    public static void main(String[] args) {

        /*
        ==在基础类型比较中比较变量的值

        equals在String类型中被重写
        用来比较两个String类型的值是否相等


        引用对象中==，equals比较地址值
        一般重写equals方法,具体参照重写内容
         */

        Student student1 = new Student("hlj", 18);
        Student student2 = new Student("hlj", 18);
        Student student3 = student1;

        System.out.println(student1 == student2);
        System.out.println(student1 == student3);
        System.out.println(student2 == student3);

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student2.equals(student3));

    }
}
