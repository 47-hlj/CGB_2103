package HLJ.day0324;

import java.util.Scanner;

public class InputInfo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请录入个人信息");
        System.out.print("姓名：");
        String name=scanner.nextLine();
        System.out.print("性别：");
        String gender=scanner.nextLine();
        System.out.print("年龄：");
        int age=scanner.nextInt();
        Person person= new Person(name,gender,age);
        System.out.println("您录入的信息为：");
        System.out.println(person.toString());
    }
}
