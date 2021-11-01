package NaiveDesignWithCondiments;

public class Espresso extends Beverages {
    public Espresso() {
        super("Espresso");
        System.out.println("Building an Espresso");
    }

    @Override
    public double getCost() {
        return 2 + super.getCost();
    }
}
