package Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        super.setName("Chicago Veggie Pizza");
        super.setDough("Thick Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Tomatoes");
        super.addTopping("Capsicum");
        super.addTopping("Corn");
        super.addTopping("Onion");
    }

    public void prepare() {
        System.out.println("---------Creating Chicago Style Veggie Pizza----------");
        super.prepare();
    }
    public void cut() {
        System.out.println("Cutting Chicago pizza into square slices");
    }
}
