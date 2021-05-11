package thread.day17;

//测试 多线程售票
//需求：设计4个售票窗口，总计售票100张
public class Test2 {
    public static void main(String[] args) {
        MyThead2 myThead2=new MyThead2();
        for (int i = 0; i < 4; i++) {//利用4个线程执行同一任务
            new Thread(myThead2).start();//被线程池代替
        }

    }
}

//创建多线程类售票--implements Runnable
class MyThead2 implements Runnable{
    static int tickets=100;

    @Override
    public void run() {
        while(true){
            if (tickets > 0) {
                //问题1：超卖
                //问题2：重卖
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"=="+tickets--);
            }
            else {
                break;
            }
        }
    }
}