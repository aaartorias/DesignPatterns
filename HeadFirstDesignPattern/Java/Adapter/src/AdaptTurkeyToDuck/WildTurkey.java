package AdaptTurkeyToDuck;

public class WildTurkey implements ITurkey {
    @Override
    public void fly() {
        System.out.println("I'm flying short distance");
    }

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }
}
