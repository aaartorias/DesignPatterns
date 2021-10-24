package NaiveDesign;

public class MinDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Initializing Mallard NaiveDesign.Duck");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        System.out.println("Initializing RedHead NaiveDesign.Duck");
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.display();
    }
}
