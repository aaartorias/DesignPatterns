package Decorator;

import Interfaces.IQuackable;

public class QuackCounter implements IQuackable {
    private IQuackable duck;
    private static int numberOfQuacks;

    public QuackCounter(IQuackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
