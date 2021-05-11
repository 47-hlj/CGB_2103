package thread.day16;

//测试   模拟多线程编程---继承

/**
 * 1.run()和start()的区别
 * run()只是一个普通方法调用
 * start()开启线程
 *
 * 2.线程的状态
 * new---线程是新建状态
 * start()---新建状态->可运行状态
 * run()---可运行状态->运行状态
 * run()运行结束完   运行状态->终止状态
 * wait()---运行状态到等待阻塞
 * sleep()/jion()---运行状态->其他阻塞
 * synchronized---运行状态->对象锁阻塞
 */
public class Test2 {
    public static void main(String[] args) {
//        new MyThread().run();//没有多线程的效果
        //启动多个线程测试------多线程结果随机性
        new MyThread().start();//1.启动线程  2.找到线程类的run()方法
        new MyThread().start();
    }
}

//1.创建多线程类---继承Thread
//需求：打印10次线程名称  重写run()方法
class MyThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(super.getName()+"=="+i);
        }
    }
}
