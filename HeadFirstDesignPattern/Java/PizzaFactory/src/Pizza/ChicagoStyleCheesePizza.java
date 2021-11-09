package Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super.setName("NY Style Sauce and Cheese Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Grated Reggiano Cheese");
    }

    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
}
