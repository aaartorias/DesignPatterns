package DecoratorBasedDesign;

public class MilkCondiment extends CondimentDecorator{

    private Beverages beverage;
    public MilkCondiment(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 1 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "With: Milk!!! ";
    }
}
