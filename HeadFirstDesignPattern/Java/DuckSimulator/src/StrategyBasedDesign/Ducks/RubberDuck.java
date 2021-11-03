package StrategyBasedDesign.Ducks;

import StrategyBasedDesign.FlyBehavior.FlyNoWay;
import StrategyBasedDesign.QuackBehavior.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
