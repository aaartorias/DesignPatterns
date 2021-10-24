package NaiveDesign;

public class ExperimentalGumballMachineEmulator {
    public static void main(String args[]) {
        ExperimentalGumballMachine gumballMachine = new ExperimentalGumballMachine(2);
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
