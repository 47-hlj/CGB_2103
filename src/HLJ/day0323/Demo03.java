package HLJ.day0323;

//while和if连用
public class Demo03 {
    public static void main(String[] args) {

//        int a =1;
//        int sum=0;
//        while(a<101){
//            sum+=a;
//            a++;
//        }
//        System.out.println(sum);

        int i=1;
        int sum=0;
        while(i<=100){
            if(i%3==0){
                sum+=i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println(sum);
    }
}
