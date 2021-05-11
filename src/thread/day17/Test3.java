package thread.day17;

//测试  同步锁  synchronized
//需求：设计4个售票窗口，总计售票100张

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 解决多线程编程数据安全隐患的问题
 * 同步：实现排队的效果，不抢
 * 锁：把有问题的资源加锁，
 * synchronized-----实现同步锁的效果,保证数据的安全性，牺牲了效率。
 * 用在方法上:synchronizd public void show(){...}
 * 用在代码块上:synchronized(锁对象){...}
 */
public class Test3 {
    public static void main(String[] args) {
        MyThread3 myThead3=new MyThread3();

        //线程池：线程复用高+托管
        //1.创建线程池
        ExecutorService pool= Executors.newFixedThreadPool(4);

        for(int i=0;i<4;i++){//利用4个线程执行同一个任务
//            new Thread(myThead3).start();//被线程池代替

            //2.利用池里的线程执行目标任务
            pool.execute(myThead3);
        }
    }
}

//创建多线程类售票----implements Runnable
class MyThread3 implements Runnable{
    int tickets=100;
    Object obj=new Object();
    /**
     *1.给方法加锁，实现了同步方法，保证了访问方法时必须排队等待不抢了，保证了数据安全
     * synchronized public void run()
     */
    @Override
    public void run() {
        while(true){
            /**2.给代码块加锁，实现同步代码块，实现了访问代码块要排队等待的效果
             * 锁哪儿---从共享资源被第一次使用开始，到用完结束
             * 锁对象是谁---可以任意,必须是同一个对象
             */
//            synchronized ("hello"){//可以
//            synchronized (this){//可以
//            synchronized (new Object()){//不可以
            synchronized (obj){//可以
                if(tickets>0){
                    try{
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"=="+tickets--);
                }
                else{
                    break;
                }
            }
        }
    }
}


