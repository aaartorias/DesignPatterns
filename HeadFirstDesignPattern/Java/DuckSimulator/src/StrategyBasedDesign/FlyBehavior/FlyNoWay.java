package StrategyBasedDesign.FlyBehavior;

import StrategyBasedDesign.FlyBehavior.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't Fly!!!");
    }
}
