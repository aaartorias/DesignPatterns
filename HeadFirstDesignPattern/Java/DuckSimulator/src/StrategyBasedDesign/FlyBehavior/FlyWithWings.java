package StrategyBasedDesign.FlyBehavior;

import StrategyBasedDesign.FlyBehavior.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Flying!!!");
    }
}
