package thread.day17;

//单例模式  懒汉式
public class Test6 {
    public static void main(String[] args) {
        Student a=Student.getStudent();
        Student b=Student.getStudent();
        System.out.println(a==b);
    }
}


//懒汉式---按需加载---线程安全的解决方案
class Student{
    //1.私有化构造方法
    private Student(){};
    //2.给外界new一个
    //共享资源被多条语句操作了，一定有安全隐患---需要加锁(锁对象必须是类名.class)
    private static Student student;
    //3.给外界返回student---按需加载
    //静态的同步方法，自动分配的锁对象是类名.class
    synchronized public static Student getStudent(){
//        synchronized(Student.class){
        if(student==null)//没有new过才new
            student=new Student();
        return student;
    }
}
