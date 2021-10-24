public class BadlyDesignedGumballMachineEmulator {
    public static void main(String args[]) {
        BadlyDesignedGumballMachine gumballMachine = new BadlyDesignedGumballMachine(2);
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
