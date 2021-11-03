package StrategyBasedDesign.Ducks;

import StrategyBasedDesign.FlyBehavior.FlyWithWings;
import StrategyBasedDesign.QuackBehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
