package Pizza;

public class ChicagoStyleGreekPizza extends Pizza {
    public ChicagoStyleGreekPizza() {
        super.setName("Chicago Greek Pizza");
        super.setDough("Thick Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Greek Cheese");
    }

    public void prepare() {
        System.out.println("---------Creating Chicago Style Greek Pizza----------");
        super.prepare();
    }

    public void cut() {
        System.out.println("Cutting Chicago pizza into square slices");
    }
}
