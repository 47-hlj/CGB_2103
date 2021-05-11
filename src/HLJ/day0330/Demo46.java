package HLJ.day0330;

public class Demo46 {
    static abstract class Vechicle{
        public int speed(){
            return 0;
        }
    }
    static class Car extends Vechicle{
        public int speed(){
            return 60;
        }
    }
    static class RaceCar extends Car{
        public int speed() {
            return 150;
        }
    }

    public static void main(String[] args) {
        RaceCar raceCar=new RaceCar();
        Car car = new RaceCar();
        Vechicle vechicle=new RaceCar();
        System.out.println(raceCar.speed());
        System.out.println(car.speed());
        System.out.println(vechicle.speed());

    }
}
