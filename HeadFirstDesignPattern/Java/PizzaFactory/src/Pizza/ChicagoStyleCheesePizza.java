package Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super.setName("Chicago Style Sauce and Cheese Pizza");
        super.setDough("Thick Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Shredded Mozzarella Cheese");
    }

    public void prepare() {
        System.out.println("---------Creating Chicago Style Clam Pizza----------");
        super.prepare();
    }
    public void cut() {
        System.out.println("Cutting Chicago pizza into square slices");
    }
}
