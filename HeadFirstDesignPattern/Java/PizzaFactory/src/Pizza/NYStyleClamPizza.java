package Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        super.setName("Clam Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Clam");
        super.addTopping("Cheese");
        super.addTopping("Mushroom");
    }

    public void prepare() {
        System.out.println("---------Creating Clam Pizza----------");
        super.prepare();
    }
}
