package StatePatternBasedDesign;

public class SoldOutState implements IGumballState {

    public GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void InsertQuarter() {
        System.out.println("Can't insert quarter. No gumball inside. Please come later!!!");
    }

    public void EjectQuarter() {
        System.out.println("Can't eject quarter. No gumball inside. Please come later!!!");
    }

    public void Crank() {
        System.out.println("Can't crank handle. No gumball inside. Please come later!!!");
    }

    public void Dispense() {
        System.out.println("Can't dispense gumball. No gumball inside. Please come later!!!");
    }
}
