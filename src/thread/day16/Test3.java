package thread.day16;

//测试  模拟多线程编程
public class Test3 {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        //2.创建Thread对象，传入Runnable的子类
        //绑定了目标类和Thread类的关系
        Thread thread=new Thread(t);
        Thread thread1=new Thread(t);
        thread.start();//开启线程
        thread1.start();
    }
}

//1.创建线程类----实现Runnable接口
class MyThread1 implements Runnable{
    //需求:打印10次线程名称
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            //利用Thread提供的静态方法currentThread()获取正在执行任务的进程
            //getName() 获取线程的名称
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}
