package InitialNaiveDesign;

public class CoffeeMachineSimulator {
    public static void main(String[] args) {
        // Create a beverage
        Beverages beverage = new DarkRoast();
        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());

        beverage = new HouseBlend();
        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());

        beverage = new Espresso();
        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());

        beverage = new DarkRoastWithMocha();
        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());

    }
}
