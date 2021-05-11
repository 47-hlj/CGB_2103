package OOP.day07;
//测试 继承
public class Test5 {
	public static void main(String[] args) {
		//TODO 3,创建子类对象测试
		Dog d = new Dog();
		d.eat();//用了父类的
		d.sleep();//用了父类的
        //System.out.println( d.sifangmoney );//不能继承父类的私有成员

		//TODO 继承的传递性
		DaHuang dh = new DaHuang();
		dh.eat();//用了爷爷类里的功能
		dh.sleep();//用了爷爷类里的功能
		dh.kanjia();//用了父类里的功能
	}
}
//1.创建父类--提取子类的所有共性的代码/提高了父类里代码的复用性
class Animal2{
	//2.3,不能继承父类的私有成员
	private double sifangmoney = 5;
	public void eat() {
		System.out.println("啥都行");
	}
	public void sleep() {
		System.out.println("在睡觉");
	}
}
//2.创建子类--使用extends关键字,继承父类后,减少了代码的编写
class Dog extends Animal2{
	public void kanjia() {}
	//2.2,java只支持单根继承
	//2.1,相当于子类把父类的功能复制了一份
}
class DaHuang extends Dog{
	//2.2,java只支持单根继承
	//2.1,相当于子类把父类的功能复制了一份
}


