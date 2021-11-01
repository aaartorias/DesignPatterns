package InitialNaiveDesign;
// Bad Design - leads to Class Explosion (NxM: N - number of beverages, M - number of condiments)
public abstract class Beverages {
    private String name;

    public Beverages(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getCost();
}
