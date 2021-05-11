package day05;

import org.junit.Test;

//测试 变量
public class Test6 {
    //1,成员变量：位置是在类里方法外+整个类中都有效+有默认值(类型不同值不同)
    String name ;//引用类型的 默认值是null
    int sex ;// 默认值是0
    double score;// 默认值是0.0
    boolean flag;// 默认值是false
    char a;// 默认值是\u0000

    int age ;
    /*
     * 单元测试方法junit：测试某些功能
     * 语法要求：方法的标记 @Test + void + public + 无参
     * 测试：选中方法名-右键-run as-junit test...
     */
    @Test
    public void show() {
        //2,局部变量:位置是在方法里+只在方法里有效+没有默认值必须赋值（初始化）
        int age = 10;
        //4,当成员变量和局部变量同名时,就近原则,优先使用局部变量，10
        System.out.println(age);//使用局部变量，10
        System.out.println(name);//成员变量,null
        System.out.println(sex);//成员变量,0
        System.out.println(score);//成员变量,0.0
        System.out.println(flag);//成员变量,false
        System.out.println(a);//成员变量,\u0000
        //3,flag的默认值是false,取反得到true使判断条件成立
        if(!flag) {
            System.out.println(1);
        }

    }

}

