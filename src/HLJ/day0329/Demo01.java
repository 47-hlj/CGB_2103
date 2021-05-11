package HLJ.day0329;

public class Demo01 {

    static class SimpleCalc{
        int a;
        public void calculate(){
            a+=7;
            System.out.println("1 "+a);
        }
    }

    public static class MultiCalc extends SimpleCalc{
        @Override
        public void calculate() {
            a-=3;
            System.out.println("2 "+a);
        }
        public void calculate(int b){
            calculate();
            super.calculate();
            a*=b;
            System.out.println("3 "+a);
        }
    }

    public static void main(String[] args) {
        MultiCalc calculator=new MultiCalc();
        calculator.calculate(2);
        System.out.println(calculator.a);
    }
}
