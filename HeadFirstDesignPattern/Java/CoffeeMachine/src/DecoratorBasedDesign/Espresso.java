package DecoratorBasedDesign;

public class Espresso extends Beverages{
    public Espresso() {
        super.setDescription("Espresso ");
    }
    @Override
    public double getCost() {
        return 30;
    }
}
