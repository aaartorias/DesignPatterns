package ImprovedStatePatternBasedDesign;

import java.util.HashMap;
import java.util.Random;

public class GumballMachine {
    private IGumballState state;
    private int gumballCount;
    private IGumballState noQuarterState;
    private IGumballState hasQuarterState;
    private IGumballState soldState;
    private IGumballState soldOutState;
    private IGumballState winnerState;
    private HashMap<String,HashMap<IGumballState,IGumballState>> transitionMap = new HashMap<String,HashMap<IGumballState,IGumballState>>();
    Random randomWinner = new Random(System.currentTimeMillis());

    public GumballMachine(int gumballCount) {
        noQuarterState = (IGumballState) new NoQuarterState();
        hasQuarterState = (IGumballState) new HasQuarterState();
        soldState = (IGumballState) new SoldState();
        soldOutState = (IGumballState) new SoldOutState();
        winnerState = (IGumballState) new WinnerState();

        buildTransitionMap();
        this.gumballCount = gumballCount;

        if (gumballCount > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    private void buildTransitionMap() {
        transitionMap.put("InsertQuarter",new HashMap<IGumballState, IGumballState>());
        transitionMap.get("InsertQuarter").put(getNoQuarterState(),getHasQuarterState());

        transitionMap.put("EjectQuarter",new HashMap<IGumballState, IGumballState>());
        transitionMap.get("EjectQuarter").put(getHasQuarterState(),getNoQuarterState());

        transitionMap.put("CrankHandle",new HashMap<IGumballState, IGumballState>());
        transitionMap.get("CrankHandle").put(getHasQuarterState(),getSoldState());

        transitionMap.put("Dispense",new HashMap<IGumballState, IGumballState>());
        transitionMap.get("Dispense").put(getSoldState(),getNoQuarterState());
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

    public IGumballState getWinnerState() {
        return winnerState;
    }
    public void setState(IGumballState state) {
        this.state = state;
    }

    public void InsertQuarter() {
        HashMap<IGumballState,IGumballState> stateMap = transitionMap.get("InsertQuarter");
        if (stateMap.containsKey(state)) {
            state.InsertQuarter();
            setState(stateMap.get(getNoQuarterState()));
        } else {
            System.out.println("Can't Insert Quarter. Operation not permitted!!");
        }
    }

    public void EjectQuarter() {
        HashMap<IGumballState,IGumballState> stateMap = transitionMap.get("EjectQuarter");
        if (stateMap.containsKey(state)) {
            state.EjectQuarter();
            setState(stateMap.get(getHasQuarterState()));
        } else {
            System.out.println("Can't Eject Quarter. Operation not permitted!!");
        }
    }

    public void CrankHandle() {
        HashMap<IGumballState,IGumballState> stateMap = transitionMap.get("CrankHandle");
        if (stateMap.containsKey(state)) {
            state.Crank();
            int winner = randomWinner.nextInt(10);
            if (winner == 0) {
                setState(getWinnerState());
            } else {
                setState(stateMap.get(getHasQuarterState()));
            }
        } else {
            System.out.println("Can't Crank Handle. Operation not permitted!!");
        }
    }

    //TODO: need to add logic to handle Winner state
    public void Dispense() {
        HashMap<IGumballState,IGumballState> stateMap = transitionMap.get("Dispense");
        if (stateMap.containsKey(state)) {
            state.Dispense();
            rollGumballOut();
        } else {
            System.out.println("Can't Dispense Gumball. Operation not permitted!!");
        }
    }
    public void rollGumballOut() {
        System.out.println("Gumball Rolling out!!!");
        gumballCount = gumballCount-1;
        if (gumballCount > 0) {
            setState(getNoQuarterState());
        } else {
            setState(getSoldOutState());
        }
    }

    public void addGumballs(int count) {
        gumballCount = gumballCount + count;
    }

}
