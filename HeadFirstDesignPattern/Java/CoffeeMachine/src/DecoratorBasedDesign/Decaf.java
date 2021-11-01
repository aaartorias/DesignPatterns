package DecoratorBasedDesign;

public class Decaf extends Beverages{
    public Decaf() {
        super.setDescription("Decaf ");
    }
    @Override
    public double getCost() {
        return 20;
    }
}
