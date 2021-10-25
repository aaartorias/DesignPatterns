package ExperimentalNaiveDesign;

public class GumballMachine {
    public StateEnum state;
    public int gumBallCount;

    public GumballMachine(int gumballCount) {
        this.gumBallCount = gumballCount;
        if (gumballCount > 0) {
            state = StateEnum.NO_QUARTER;
        } else {
            state = StateEnum.SOLD_OUT;
        }
    }

    void InsertQuarter() {
        if (state == StateEnum.NO_QUARTER) {
            System.out.println("Quarter Inserted!!!");
            state = StateEnum.HAS_QUARTER;
        } else if (state == StateEnum.HAS_QUARTER) {
            System.out.println("Already a quarter inside. Please wait!!!");
        }  else if (state == StateEnum.SOLD) {
            System.out.println("Can't insert quarter. Gumball dispense in progress. Please wait!!!");
        }  else if (state == StateEnum.SOLD_OUT) {
            System.out.println("Can't insert quarter. No gumball inside. Please come later!!!");
        }
    }

    void EjectQuarter() {
        if (state == StateEnum.NO_QUARTER) {
            System.out.println("Can't eject quarter. No quarter inserted");
        } else if (state == StateEnum.HAS_QUARTER) {
            System.out.println("Returning the inserted Quarter!!!");
            state = StateEnum.NO_QUARTER;
        }  else if (state == StateEnum.SOLD) {
            System.out.println("Can't eject quarter. Gumball dispense in progress. Please wait!!!");
        }  else if (state == StateEnum.SOLD_OUT) {
            System.out.println("Can't eject quarter. No gumball inside. Please come later!!!");
        }
    }

    void CrankHandle() {
        if (state == StateEnum.NO_QUARTER) {
            System.out.println("Can't crank handle. No quarter inserted");
        } else if (state == StateEnum.HAS_QUARTER) {
            System.out.println("Cranking the handle!!!");
            state = StateEnum.SOLD;
            Dispense();
        }  else if (state == StateEnum.SOLD) {
            System.out.println("Can't crank handle. Gumball dispense in progress. Please wait!!!");
        }  else if (state == StateEnum.SOLD_OUT) {
            System.out.println("Can't crank handle. No gumball inside. Please come later!!!");
        }
    }

    void Dispense() {
        if (state == StateEnum.NO_QUARTER) {
            System.out.println("Can't dispense. No quarter inserted");
        } else if (state == StateEnum.HAS_QUARTER) {
            System.out.println("Can't dispense. Crank handle first!!!");
        }  else if (state == StateEnum.SOLD) {
            System.out.println("Dispensing Gumball. Please collect your gumball!!!");
            gumBallCount = gumBallCount - 1;
            if (gumBallCount > 0) {
                state = StateEnum.NO_QUARTER;
            } else {
                state = StateEnum.SOLD_OUT;
            }
        }  else if (state == StateEnum.SOLD_OUT) {
            System.out.println("Can't dispense. No gumball inside. Please come later!!!");
        }
    }

}
// Adding new state will open all the methods for changes. It becomes maintaining nightmare
// as new states are added, the change has be made cross all the actions i.e. methods()