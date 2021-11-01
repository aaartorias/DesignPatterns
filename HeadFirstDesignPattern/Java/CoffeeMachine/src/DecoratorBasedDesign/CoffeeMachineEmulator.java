package DecoratorBasedDesign;

public class CoffeeMachineEmulator {
    public static void main(String[] args) {
        // Double Mocha Whipped Cream House Blend
        Beverages houseBlend = new HouseBlend();
        Beverages mochaWithHouseBlend = new MochaCondiment(houseBlend);
        Beverages doubleMochaWithHouseBlend = new MochaCondiment(mochaWithHouseBlend);
        Beverages whippedDoubleMochaHouseBlend = new WhipCondiment(doubleMochaWithHouseBlend);
        System.out.println("Order Details: " + whippedDoubleMochaHouseBlend.getDescription());
        System.out.println("Bill: " + whippedDoubleMochaHouseBlend.getCost());
    }
}
