package Ducks;

import Interfaces.IQuackable;

public class DuckCall implements IQuackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
