package Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        super.setName("Thick Pepperoni Pizza");
        super.setDough("Chicago Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Pepperoni");
    }

    public void prepare() {
        System.out.println("---------Creating Chicago Style Pepperoni Pizza----------");
        super.prepare();
    }

    public void cut() {
        System.out.println("Cutting Chicago pizza into square slices");
    }
}
