package StatePatternBasedDesignHashmapApproach;

public class SoldState implements IGumballState{

    public void InsertQuarter() {
        System.out.println("Can't insert quarter. Gumball dispense in progress. Please wait!!!");
    }

    public void EjectQuarter() {
        System.out.println("Can't eject the quarter. Gumball dispense in progress. Please wait!!!");
    }

    public void Crank() {
        System.out.println("Can't crank the handle. Gumball dispense in progress. Please wait!!!");
    }

    public void Dispense() {
        System.out.println("Dispensing gumball. Please collect your gumball!!!");
        //gumballMachine.rollGumballOut();
    }
}
