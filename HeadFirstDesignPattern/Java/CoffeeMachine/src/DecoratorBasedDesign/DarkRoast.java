package DecoratorBasedDesign;

public class DarkRoast extends Beverages{

    public DarkRoast() {
        super.setDescription("Dark Roast ");
    }
    @Override
    public double getCost() {
        return 10;
    }
}
