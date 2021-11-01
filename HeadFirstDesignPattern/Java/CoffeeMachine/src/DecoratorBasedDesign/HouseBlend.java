package DecoratorBasedDesign;

public class HouseBlend extends Beverages{
    public HouseBlend() {
        super.setDescription("House Blend ");
    }
    @Override
    public double getCost() {
        return 40;
    }
}
