package thread.day16;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        //1.创建对象
        Thread t=new Thread();

        //2.调用方法
        System.out.println(t.getId());//获取线程的id
        System.out.println(t.getName());//
        t.setName("test");//设置线程的名称
        System.out.println(t.getName());//获取线程的名字
        t.run();//运行
        t.start();//开启线程
        t.stop();//结束线程
        Thread.sleep(10000);//线程休眠
        Thread t2=Thread.currentThread();//获取正在执行任务的线程
        System.out.println(t2.getName());

    }
}
