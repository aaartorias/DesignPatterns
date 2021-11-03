package StrategyBasedDesign.Ducks;

import StrategyBasedDesign.FlyBehavior.IFlyBehavior;
import StrategyBasedDesign.QuackBehavior.IQuackBehavior;

public abstract class Duck {
    private IQuackBehavior quackBehavior;
    private IFlyBehavior flyBehavior;


    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }



    public void swim() {
        System.out.println("Swimming...");
    }
    public abstract void  display();

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

}