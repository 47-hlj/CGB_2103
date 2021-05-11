package thread.day17;

public class Test4 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {//用4个线程模拟4个窗口
            new MyThread4().start();//启动线程
        }
    }
}

class MyThread4 extends Thread{
    static int tickets=100;
    //2.方法可以被同步修饰，普通方法，会自动分配this对象
    //                    静态方法，会自动分配类名.class对象
    @Override
    public void run() {
        while(true){
            synchronized (MyThread4.class){
                //1.锁对象是谁？--如果资源是静态资源，锁对象必须是类名.class
                //             --如果共享资源是普通资源，锁对象可以任意
                if(tickets>0){
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"=="+tickets--);
                }else{
                    break;
                }
            }
        }
    }
}
