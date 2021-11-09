package Pizza;

public class GreekPizza extends Pizza {
    public GreekPizza() {
        super.setName("Greek Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Greek Cheese");
    }

    public void prepare() {
        System.out.println("---------Creating Greek Pizza----------");
        super.prepare();
    }
}
