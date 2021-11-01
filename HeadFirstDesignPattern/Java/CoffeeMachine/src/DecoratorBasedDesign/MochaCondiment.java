package DecoratorBasedDesign;

public class MochaCondiment extends CondimentDecorator{

    private Beverages beverage;
    public MochaCondiment(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 4 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "With: Mocha ";
    }
}
