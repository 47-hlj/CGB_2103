package OOP.day07;
//测试 构造方法
//总结:
//1,作用: 可以用来new + 可以给成员变量赋值
//2,语法: 修饰符 类名([参数列表]){方法体}
//3,构造方法什么时候被触发? -- new时
//4,构造方法会隐藏着一个 无参的 构造方法,但是当只提供含参构造方法时,无参构造就没有了
//5,为了外界new的方便两个,可以提供重载的构造方法
//6,如果把构造方法private,那就只能在本类访问,外界无法new
public class Test2 {
	public static void main(String[] args) {
		//3,创建对象/实例化 时自动触发  构造方法
		new Person();//自动触发 无参  的构造方法
		new Person("赵丽颖");//自动触发 String 的构造方法
		new Person(100);//自动触发 int 的构造方法
		new Person("jack",100);//自动触发 String和int 的构造方法
	}
}
//TODO 构造方法--修饰符 类名([参数列表]){方法体}
class Person {
	//1,无参的 构造方法,默认就存在的,是隐藏的(前提是:不能只提供含参构造)
	public Person(){}
	//2,构造方法是一个特殊的方法,可以方法重载
	//重载:在一个类里的 方法名相同,但是参数列表不同 现象--灵活
	private String s ;
	public Person(String name){
		s = name;//3,利用构造方法,给成员变量赋值
		System.out.println(name);
	}
	public Person(int age){
		System.out.println(age);
	}
	public Person(String name,int age){
		System.out.println(name+age);
	}
}