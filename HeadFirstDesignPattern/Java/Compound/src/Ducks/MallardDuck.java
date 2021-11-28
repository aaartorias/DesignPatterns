package Ducks;

import Interfaces.IQuackable;

public class MallardDuck implements IQuackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
