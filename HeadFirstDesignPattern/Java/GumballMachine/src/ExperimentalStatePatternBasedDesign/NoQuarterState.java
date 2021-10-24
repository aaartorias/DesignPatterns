package ExperimentalStatePatternBasedDesign;

public class NoQuarterState implements IGumballState {

    public GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void InsertQuarter() {
        System.out.println("Quarter Inserted!!!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void EjectQuarter() {
        System.out.println("Can't eject quarter. No quarter inserted");
    }

    public void Crank() {
        System.out.println("Can't crank handle. No quarter inserted");
    }

    public void Dispense() {
        System.out.println("Can't dispense gumball. No quarter inserted");
    }
}
