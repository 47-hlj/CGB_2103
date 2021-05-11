package thread.day17;

//测试 多线程售票
//需求：设计4个售票窗口，总计售票100张
public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {//用4个线程模拟4个窗口
            new MyThread1().start();//启动线程
        }
    }


}
//创建多线程类售票 -- extends Thread
class MyThread1 extends Thread{
    //问题1：4个线程卖了400张票，原因是内存中有4个tickets，总共400张
    //    int tickets = 100;//定义变量，记录票数100
    //解决问题1：tickets只有一份，只让tickets加载一次
    static int tickets = 100;//定义变量，记录票数100
    public void run() {
        //一直就卖票
        while(true){
            if(tickets>0){//有票就卖
                //问题2:超卖--出现了0 -1 -2的票
                //问题3:重卖--出现了58号票卖了3次
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //问题3的原因：tickets=58,t1 t2 t3 t4来准备卖票
                //假设t1先醒,准备卖票,tickets=58,执行tickets--,输出58,还没 自减变成57
                //假设t3先醒,准备卖票,tickets=58,执行tickets--,输出58,还没 自减变成57
                //假设t2先醒,准备卖票, tickets=58, 执行tickets--,输出58,自减变成57
                //假设t4先醒,准备卖票,tickets=57, 执行tickets--,输出57...
                System.out.println(super.getName()+"=="+tickets--);
            }else{
                break;//结束死循环
            }
        }
    }
}