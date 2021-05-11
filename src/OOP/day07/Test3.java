package OOP.day07;
//测试 构造代码块
/**总结：
 * 1,构造代码块：作用是提取构造方法的共性代码+位置是在类里方法外
 * 2,构造方法：作用是new/赋值+位置是在类里方法外
 * 3,局部代码块：作用是控制变量的作用范围+位置是在方法里
 * 4,执行的顺序：
 * 当new时，先执行 构造代码块 再执行构造方法
 * 当方法被调用时，才执行 局部代码块
 */
public class Test3 {
	public static void main(String[] args) {
		//TODO 2,创建对象测试
		new Teacher();
		new Teacher(10);
		new Teacher("jack");
		new Teacher('中');
		new Teacher("jack",20);
	}
}
class Teacher{
	//TODO 2,构造代码块：位置是在成员位置
	//new时被触发而且在构造方法前+用来抽取构造方法的共性
	{
		//提取了所有构造方法里的重复代码--提高了代码的复用性
		System.out.println("中国人");
		System.out.println("构造代码块");
	}

	//TODO 1,构造方法/Constructors...
	public Teacher() {
	}
	public Teacher(int a) {
	}
	public Teacher(String b) {
	}
	public Teacher(char c) {}
	public Teacher(String a,int b) {}

	public void show() {
		int a = 0; //局部变量
		//3,局部代码块--位置是在方法里+用来控制变量的作用范围
		//当方法被调用时，才能触发
		{
			int b = 10;
			System.out.println("局部代码块");
		}
        //System.out.println(b);//超出作用域了，用不了
		System.out.println(a);//可以用，在使用范围内
	}
}






