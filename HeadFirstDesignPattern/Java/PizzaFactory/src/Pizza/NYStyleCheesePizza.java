package Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super.setName("NY Style Sauce and Cheese Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Grated Reggiano Cheese");
    }

    public void prepare() {
        System.out.println("---------Creating NewYork Style Cheese Pizza----------");
        super.prepare();
    }
}
