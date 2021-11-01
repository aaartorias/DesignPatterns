package NaiveDesignWithCondiments;

public class DarkRoast extends Beverages {
    public DarkRoast() {
        super("Dark Roast");
        System.out.println("Building a Dark Roast");
    }

    @Override
    public double getCost() {
        return 3 + super.getCost();
    }
}
