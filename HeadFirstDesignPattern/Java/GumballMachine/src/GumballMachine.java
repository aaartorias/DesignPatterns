public class GumballMachine {
    public IGumballState state;
    public int gumballCount;
    public IGumballState noQuarterState;
    public IGumballState hasQuarterState;
    public IGumballState soldState;
    public IGumballState soldOutState;

    public GumballMachine(int gumballCount) {
        noQuarterState = (IGumballState) new NoQuarterState(this);
        hasQuarterState = (IGumballState) new HasQuarterState(this);
        soldState = (IGumballState) new SoldState(this);
        soldOutState = (IGumballState) new SoldOutState(this);

        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            this.state = noQuarterState;
        } else {
            this.state = soldOutState;
        }
    }

    public IGumballState getNoQuarterState() {
        return noQuarterState;
    }

    public IGumballState getHasQuarterState() {
        return hasQuarterState;
    }

    public IGumballState getSoldState() {
        return soldState;
    }

    public IGumballState getSoldOutState() {
        return soldOutState;
    }

    public void setState(IGumballState state) {
        this.state = state;
    }

    public void InsertQuarter() {
        state.InsertQuarter();
    }

    public void EjectQuarter() {
        state.EjectQuarter();
    }

    public void CrankHandle() {
        state.Crank();
        Dispense();
    }

    public void Dispense() {
        state.Dispense();
    }
    public void rollGumballOut() {
        System.out.println("Gumball Rolling out!!!");
        gumballCount = gumballCount-1;
        if (gumballCount > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

}
