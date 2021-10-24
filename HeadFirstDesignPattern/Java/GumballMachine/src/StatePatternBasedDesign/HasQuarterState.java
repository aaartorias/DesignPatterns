package StatePatternBasedDesign;

public class HasQuarterState implements IGumballState {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void InsertQuarter() {
        System.out.println("Already a quarter inside. Please wait!!!");
    }

    public void EjectQuarter() {
        System.out.println("Returning the inserted Quarter!!!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void Crank() {
        System.out.println("Cranking the handle!!!");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void Dispense() {
        System.out.println("Can't dispense gumball. Gumball dispense in progress. Please wait!!!");
    }
}
