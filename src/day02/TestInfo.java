package day02;
/**
 * 	本类用于测试在控制台打印个人信息
 * 	需求: 在控制台打印:
 *  java架构师XXX今年X岁，月薪XXX，感慨java是世界上最好的语言
 *  @author XYCheng
 */
public class TestInfo {
	//Alt+/ 提示补全代码  Ctrl+s保存代码  Ctrl+F11执行代码
	public static void main(String[] args) {
		/**1.在我们的程序当中{} [] () "" 都是成对出现的,而且都是英文符号*/
		/**2. 一串数据,在java里是字符串类型—String
		 * 字符串类型的数据,要被一对双引号 引起来*/
		System.out.println("欢迎来到Java世界,可爱的程序猿们");

		/**3.定义变量的规则:数据类型 数据名 数据值 */
		String name="hulijiang";
		int age = 18;
		double salary = 100000.99;

		/**4.把静态数据与动态数据分开,通过+实现动态数据的动态拼接*/
		System.out.println("我叫"+name);
		/**5.如果是在中间拼接用""+变量+""的格式*/
		System.out.println("java架构师"+name+",今年"+age+"岁,月薪"+salary+",感慨java是世界上最好的语言");
	}
}












