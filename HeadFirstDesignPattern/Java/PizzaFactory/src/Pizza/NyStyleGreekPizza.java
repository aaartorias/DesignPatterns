package Pizza;

public class NyStyleGreekPizza extends Pizza {
    public NyStyleGreekPizza() {
        super.setName("Ny Style Greek Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.addTopping("Greek Cheese");
    }

    public void prepare() {
        System.out.println("---------Creating NewYork Style Greek Pizza----------");
        super.prepare();
    }
}
