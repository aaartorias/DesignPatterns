package NaiveDesignWithCondiments;

public class Decaf extends Beverages {
    public Decaf() {
        super("Decaf");
        System.out.println("Building a Decaf");
    }

    @Override
    public double getCost() {
        return 4 + super.getCost();
    }
}
