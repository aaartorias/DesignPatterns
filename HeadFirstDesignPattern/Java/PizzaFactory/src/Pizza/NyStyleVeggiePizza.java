package Pizza;

public class NyStyleVeggiePizza extends Pizza {
    public NyStyleVeggiePizza() {
        super.setName("Ny Style Veggie Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Tomatoes");
        super.addTopping("Capsicum");
        super.addTopping("Corn");
        super.addTopping("Onion");
    }

    public void prepare() {
        System.out.println("---------Creating NewYork Style Veggie Pizza----------");
        super.prepare();
    }
}
