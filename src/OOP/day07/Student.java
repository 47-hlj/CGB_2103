package OOP.day07;
//测试 封装-private
//总结:
//1,通过private关键字,实现封装,提高资源的安全性(只能在本类里访问)
//2,当属性被private后,需要提供public的getXxx()获取值/setXxx()设置值
//3,当方法被private后,需要提供间接的访问方式
//4.被封装的成员变量，可通过set方法和构造方法来设置值
public class Student {
	//TODO Fields--成员变量/实例变量
//1,通过private关键字,实现封装,只能在本类中访问使用,别的类用不了.提高了安全性
	private String name;
	private int no;
	private char sex;
	//5,Eclipse自动生成get/set
//右键source-generate getters and setters-select all-ok
	//3,给外界提供 获取方式get()
	public String getName() {
		return name;//给外界返回name属性的值
	}
	//4,给外界提供设置方式set()
	public void setName(String name) {
		this.name = name;//给name属性赋值
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	//TODO Methods--方法/函数
//1,通过private关键字,实现封装,只能在本类中访问使用,别的类用不了.提高了安全性
	private void coding() {
		System.out.println("我爱Java");
	}
	public void game() {
//2,因为coding()被封装了,只能在本类中访问,给外界提供间接的访问方式
		coding();
		System.out.println("王者");
	}
}