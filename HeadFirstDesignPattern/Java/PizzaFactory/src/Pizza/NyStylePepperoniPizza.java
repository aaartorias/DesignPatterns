package Pizza;

public class NyStylePepperoniPizza extends Pizza {
    public NyStylePepperoniPizza() {
        super.setName("Ny Style Pepperoni Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Pepperoni");
    }

    public void prepare() {
        System.out.println("---------Creating NewYork Style Pepperoni Pizza----------");
        super.prepare();
    }
}
