package Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super.setName("Cheese Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Grated Reggiano Cheese");
    }

    public void prepare() {
        System.out.println("---------Creating Cheese Pizza----------");
        super.prepare();
    }
}
