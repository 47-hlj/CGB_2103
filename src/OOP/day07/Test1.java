package OOP.day07;

//测试 封装
public class Test1 {
	public static void main(String[] args) {
		//TODO 创建Student对象
		Student s = new Student();
		//调用方法
//		s.coding();//因为coding()被封装了,无法使用
		s.game();
		//设置属性
//		s.name = "蔡徐坤";//因为name被封装了,无法使用
//		s.no = 100;
//		s.sex = '男' ;
		s.setName("渣渣辉");//设置值
		s.setNo(1);
		s.setSex('男');
		//获取属性
//		System.out.println(s.name);//因为name被封装了,无法使用
//		System.out.println(s.no);
//		System.out.println(s.sex);
		System.out.println(s.getName());//获取值
		System.out.println(s.getNo());//获取值
		System.out.println(s.getSex());//

//        System.out.println(s.toString());
	}
}





