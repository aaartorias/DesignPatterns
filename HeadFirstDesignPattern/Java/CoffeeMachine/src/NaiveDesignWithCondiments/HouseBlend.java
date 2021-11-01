package NaiveDesignWithCondiments;

public class HouseBlend extends Beverages {
    public HouseBlend() {
        super("House Blend");
        System.out.printf("Building a House Blend");
    }
    @Override
    public double getCost() {
        return 5 + super.getCost();
    }
}
