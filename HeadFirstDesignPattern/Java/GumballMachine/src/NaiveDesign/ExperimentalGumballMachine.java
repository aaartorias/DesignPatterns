package NaiveDesign;

public class ExperimentalGumballMachine {
    public StateEnum state;
    public int gumBallCount;

    public ExperimentalGumballMachine(int gumballCount) {
        this.gumBallCount = gumballCount;
        if (gumballCount > 0) {
            state = StateEnum.NO_QUARTER;
        } else {
            state = StateEnum.SOLD_OUT;
        }
    }

    void InsertQuarter() {
        if (state != StateEnum.NO_QUARTER) {
            System.out.println("Can't insert quarter. Machine busy. Please wait!!!");
        }  else {
            System.out.println("Quarter Inserted!!!");
            state = StateEnum.HAS_QUARTER;
        }
    }

    void EjectQuarter() {
        if (state != StateEnum.HAS_QUARTER) {
            System.out.println("Can't eject quarter. Machine busy. Please wait");
        } else {
            System.out.println("Returning the inserted Quarter!!!");
            state = StateEnum.NO_QUARTER;
        }
    }

    void CrankHandle() {
        if (state != StateEnum.HAS_QUARTER) {
            System.out.println("Can't crank handle. Machine busy. Please wait");
        } else  {
            System.out.println("Cranking the handle!!!");
            state = StateEnum.SOLD;
            Dispense();
        }
    }

    void Dispense() {
        if (state != StateEnum.SOLD) {
            System.out.println("Can't dispense. Machine busy. Please wait!!!");
        } else {
            System.out.println("Dispensing Gumball. Please collect your gumball!!!");
            gumBallCount = gumBallCount - 1;
            if (gumBallCount > 0) {
                state = StateEnum.NO_QUARTER;
            } else {
                state = StateEnum.SOLD_OUT;
            }
        }
    }
}
// problem: message is not clear