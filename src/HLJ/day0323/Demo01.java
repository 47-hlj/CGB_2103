package HLJ.day0323;


//循环结构
public class Demo01 {
    public static void main(String[] args) {

        /*
        四种循环
        for   do-while  while  for增强型

        while循环结构
        while(boole表达式){
           ...........
        }

        do-while循环结构
        do{
          ........
         }while(boolean表达式)

         while和do-while区别
         关键：执行判断的顺序
         while先进行boolean表达式的判断再进行循环体的执行；
         do-while先执行一次循环体，再进行boolean表达式的判断；
         真：继续循环体的执行，假：结束循环
         相对来说do-while多执行一次循环体，至少执行一次
         do-while一般少用，有些情况下不建议使用

         for循环结构
         for(变量申明;boolean表达式;++/--){
            ......................
         }

         Java增强型for循环结构
         for(申明语句：表达式){
            .............
         }

         循环关键字
         break:多层循环中跳出本次循环(离break最近的循环)
         continue:do-while和while中跳转到boolean表达式，for中直接跳转到更新语句；

         避免真正的死循环，使用break跳出；
         循环体为空的死循环；
         */

        int a=1;
        while(a<=100){
            if(a%2!=0){
               System.out.println(a);
            }
            a++;
        }
    }
}