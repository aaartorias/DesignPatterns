package NaiveDesign;

public class MinDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Initializing Mallard Duck");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();
        System.out.println("Initializing RedHead Duck");
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.fly();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
    }
}
