package Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        super.setName("Veggie Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Tomatoes");
        super.addTopping("Capsicum");
        super.addTopping("Corn");
        super.addTopping("Onion");
    }

    public void prepare() {
        System.out.println("---------Creating Veggie Pizza----------");
        super.prepare();
    }
}
