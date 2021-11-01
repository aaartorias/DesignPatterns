package NaiveDesignWithCondiments;
// Bad Design - We are limited by number of condiments that can be added to a beverage
// we can't add two shots of mocha (We can use ArrayList of condiments to facilitate this)
// Addition of new condiments leaves Beverages class open for change
public abstract class Beverages {
    private String name;
    private boolean hasMocha;
    private boolean hasMilk;
    private boolean hasSoy;
    private boolean hasWhip;
    private ICondiment milkCondiment;
    private ICondiment mochaCondiment;
    private ICondiment soyCondiment;
    private ICondiment whipCondiment;

    public Beverages(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        double cost = 0;
        if (hasMilk) {
            cost = cost + milkCondiment.getCost();
        }
        if (hasMocha) {
            cost = cost + mochaCondiment.getCost();
        }
        if (hasSoy) {
            cost = cost + soyCondiment.getCost();
        }
        if (hasWhip) {
            cost = cost + whipCondiment.getCost();
        }
        return cost;
    }

    public void setCondiment(ICondiment condiment) {
        if (condiment instanceof MilkCondiment) {
            System.out.println("Adding Milk!!!");
            hasMilk = true;
            milkCondiment = condiment;
        } else if (condiment instanceof WhipCondiment) {
            System.out.println("Adding Whip cream!!!");
            hasWhip = true;
            whipCondiment = condiment;
        } else if (condiment instanceof MochaCondiment) {
            System.out.println("Adding Mocha!!!");
            hasMocha = true;
            mochaCondiment = condiment;
        } else if (condiment instanceof SoyCondiment) {
            System.out.println("Adding Soy!!!");
            hasSoy = true;
            soyCondiment = condiment;
        }
    }
}
