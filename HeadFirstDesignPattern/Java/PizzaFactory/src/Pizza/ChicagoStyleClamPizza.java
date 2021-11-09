package Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        super.setName("Chicago Clam Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Clam");
        super.addTopping("Cheese");
        super.addTopping("Mushroom");
    }

    public void prepare() {
        System.out.println("---------Creating Style Chicago Clam Pizza----------");
        super.prepare();
    }

    public void cut() {
        System.out.println("Cutting Chicago pizza into square slices");
    }
}
