package ImprovedStatePatternBasedDesign;

public class HasQuarterState implements IGumballState {

    public void InsertQuarter() {
        System.out.println("Already a quarter inside. Please wait!!!");
    }

    public void EjectQuarter() {
        System.out.println("Returning the inserted Quarter!!!");
    }

    public void Crank() {
        System.out.println("Cranking the handle!!!");
    }

    public void Dispense() {
        System.out.println("Can't dispense gumball. Gumball dispense in progress. Please wait!!!");
    }
}
