package OOP.day06;

//一个java文件可以创建多个同级的类，但只有一个类能用public修饰，该类必须与java文件名相同
public class Test1 {
    public static void main(String[] args) {
        //2.通过new创建对象
        new Phone();//匿名对象,一次只执行一个任务
        //3.phone是引用类型，存地址值
        Phone phone=new Phone();//有名字的对象
        System.out.println(phone);//OOP.day06.Phone@6d6f6e28
        Phone phone1=new Phone();
        System.out.println(phone1);//OOP.day06.Phone@135fbaa4
        //4.调用Phone类里的方法
        phone.playGame();
        phone.call();
        phone.message();
        //5.调用Phone类里的属性--获取/赋值
        System.out.println(phone.size+" "+phone.brand+" "+phone.color);
        //设置属性的值
        phone.size=6.8;
        phone.brand="huawei";
        phone.color="blue";
        //获取属性的值
        System.out.println(phone.size+" "+phone.brand+" "+phone.color);
    }
}

//1.创建一个手机类---描述手机
class Phone{
    //特征--属性/成员方法(类里方法外)
    //大小、品牌、颜色
    double size;
    String brand;
    String color;

    //构造方法
    public Phone() {
    }

    public Phone(double size, String brand, String color) {
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    //功能--方法/成员方法(类里方法外)
    //玩游戏、打电话、发短信
    public void playGame(){
        System.out.println("使用手机玩游戏");
    }
    public void call(){
        System.out.println("使用手机打电话");
    }

    public void message(){
        System.out.println("使用手机发短信");
    }
}
