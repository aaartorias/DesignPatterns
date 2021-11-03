package StrategyBasedDesign;

import StrategyBasedDesign.Ducks.Duck;
import StrategyBasedDesign.Ducks.MallardDuck;
import StrategyBasedDesign.Ducks.RubberDuck;
import StrategyBasedDesign.FlyBehavior.FlyNoWay;
import StrategyBasedDesign.FlyBehavior.FlyVeryHigh;
import StrategyBasedDesign.QuackBehavior.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck = new RubberDuck();
        duck.display();
        duck.quack();
        duck.fly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.fly();
        duck.quack();
        duck.setFlyBehavior(new FlyVeryHigh());
        duck.fly();

    }
}
