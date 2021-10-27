package ImprovedStatePatternBasedDesign;

public class GumballMachineEmulator {
    public static void main(String args[]) {
        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.Dispense();
        gumballMachine.EjectQuarter();
        gumballMachine.InsertQuarter();
        gumballMachine.EjectQuarter();
        gumballMachine.InsertQuarter();
        gumballMachine.InsertQuarter();
        gumballMachine.CrankHandle();
        gumballMachine.EjectQuarter();
        gumballMachine.Dispense();
    }
}
