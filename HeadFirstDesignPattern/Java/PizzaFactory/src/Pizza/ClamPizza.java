package Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
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
