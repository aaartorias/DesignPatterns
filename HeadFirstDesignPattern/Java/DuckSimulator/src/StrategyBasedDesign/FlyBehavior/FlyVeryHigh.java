package StrategyBasedDesign.FlyBehavior;

public class FlyVeryHigh implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying very high!!!");
    }
}
