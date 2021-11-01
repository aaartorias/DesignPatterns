package DecoratorBasedDesign;

public abstract class Beverages {
    private String description;
    public String getDescription() {return description;}
    public abstract double getCost();
    public void setDescription(String description) {
        this.description = description;
    }
}
