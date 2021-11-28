package Ducks;

import Interfaces.IQuackable;

public class RubberDuck implements IQuackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
