package AbstractFactory;

public abstract class Pizza {
    private String name;
    private IDough dough;
    private Isauce sauce;
    private IVeggies veggies[];
    private ICheese cheese;
    private IPepperoni pepperoni;
    private IClams clam;

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal pieces");
    }

    public void box() {
        System.out.println("Place the pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(IDough dough) {
        this.dough = dough;
    }

    public void setSauce(Isauce sauce) {
        this.sauce = sauce;
    }

    public void setVeggies(IVeggies[] veggies) {
        this.veggies = veggies;
    }

    public void setCheese(ICheese cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(IPepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setClam(IClams clam) {
        this.clam = clam;
    }

//    public String toString() {
//
//    }

}
