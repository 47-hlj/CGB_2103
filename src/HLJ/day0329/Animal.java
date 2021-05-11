package HLJ.day0329;

public class Animal {
    public String noise(){
        return "peep";
    }

    static class Dog extends Animal{

        public String noise() {
            return "bark";
        }
    }

    static class Cat extends Animal{
        public String noise() {
            return "meow";
        }
    }

    public static void main(String[] args) {
        Animal animal=new Dog();
        Cat cat=(Cat)animal;
        System.out.println(cat.noise());

    }
}
