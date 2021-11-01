package NaiveDesignWithCondiments;

public class CoffeeMachineSimulator {
    public static void main(String[] args) {
        // Create a beverage

        ICondiment milk = new MilkCondiment();
        ICondiment soy = new SoyCondiment();
        ICondiment whip = new WhipCondiment();
        ICondiment mocha = new MochaCondiment();

        Beverages beverage = new DarkRoast();
        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());
        beverage.setCondiment(mocha);
        beverage.setCondiment(soy);
        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());

//        beverage = new HouseBlend();
//        System.out.println(beverage.getName());
//        System.out.println(beverage.getCost());
//
//        beverage = new Espresso();
//        System.out.println(beverage.getName());
//        System.out.println(beverage.getCost());

       // beverage = new DarkRoastWithMocha();
//        System.out.println(beverage.getName());
//        System.out.println(beverage.getCost());

    }
}
