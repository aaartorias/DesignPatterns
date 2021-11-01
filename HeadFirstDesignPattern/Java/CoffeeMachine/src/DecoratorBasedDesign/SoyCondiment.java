package DecoratorBasedDesign;

public class SoyCondiment extends CondimentDecorator{

    private Beverages beverage;
    public SoyCondiment(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 3 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "With: Soy ";
    }
}
