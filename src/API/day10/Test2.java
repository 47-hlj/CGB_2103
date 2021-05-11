package API.day10;

//测试 重写Object类的toString和equals方法
public class Test2 {
    public static void main(String[] args) {
        //TODO 创建学生对象
        Student s=new Student("hulijiang",21);
        Student s1=new Student("hulijiang",21);
        //打印s试，底层自动调用了Object提供的toString();
        System.out.println(s);
        System.out.println(s.toString());//Object提供的toString
        System.out.println(s1);
        System.out.println(s1.toString());
        //equals()用了父类Object的，Object就是用了==比较，比较s和s1的地址值
        System.out.println(s.equals(s1));
    }

}
