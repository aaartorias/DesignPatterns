package ExperimentalNaiveDesign;

public class GumballMachineEmulator {
    public static void main(String args[]) {
        NaivelyDesignedGumballMachine gumballMachine = new NaivelyDesignedGumballMachine(2);
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
