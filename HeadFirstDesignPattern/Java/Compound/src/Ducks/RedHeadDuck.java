package Ducks;

import Interfaces.IQuackable;

public class RedHeadDuck implements IQuackable {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
