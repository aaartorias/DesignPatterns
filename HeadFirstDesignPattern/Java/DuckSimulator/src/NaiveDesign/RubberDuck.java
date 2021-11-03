package NaiveDesign;

public class RubberDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I am a Rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        System.out.println("Fly No Way");
    }
}
