package ImprovedStatePatternBasedDesign;

public interface IGumballState {
    public void InsertQuarter();
    public void EjectQuarter();
    public void Crank();
    public void Dispense();
}
