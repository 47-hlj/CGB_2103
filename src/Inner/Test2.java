package Inner;


//测试 局部内部类
public class Test2 {
    public static void main(String[] args) {
        //3.使用接口
        AA a=new BB();//多态对象
        a.save();
        //4.匿名内部类配合匿名对象一起用--好处优化了结构
        new AA(){//直接new接口，在内部类里重写抽象方法
            @Override
            public void save() {
                System.out.println(321);
            }
        }.save();//调用方法

        //TODO 5.练习匿名内部类
        X x=new X(){
            @Override
            public void del(int id) {
                System.out.println(id);
            }
            @Override
            public void get() {
                System.out.println(100);
            }
        };
        //匿名对象，一次只能执行一个认为有。想用一个对象执行很多任务
        x.get();//调用方法
        x.del(10);
    }
}
//TODO 5.练习匿名内部类
interface X{
    void del(int id);
    void get();
}
//1.定义一个接口
interface AA{
    void save();
}
//2.创建实现类，实现接口，必须重写所有抽象方法，否则就是一个抽象类
class BB implements AA{
    @Override
    public void save() {
        System.out.println(123);
    }
}
