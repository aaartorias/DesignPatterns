package InitialNaiveDesign;

public class Espresso extends Beverages{
    public Espresso() {
        super("Building an Espresso");
    }

    @Override
    public double getCost() {
        return 2;
    }
}
