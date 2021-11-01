package InitialNaiveDesign;

public class Decaf extends Beverages{
    public Decaf() {
        super("Building a Decaf");
    }

    @Override
    public double getCost() {
        return 4;
    }
}
