package DecoratorBasedDesign;

public class WhipCondiment extends CondimentDecorator{

    private Beverages beverage;
    public WhipCondiment(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 2 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Whip: Whip!!! ";
    }
}
