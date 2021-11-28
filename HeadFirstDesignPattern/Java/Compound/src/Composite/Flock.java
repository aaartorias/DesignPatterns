package Composite;

import Interfaces.IQuackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements IQuackable {
    private ArrayList<IQuackable> quackers;

    public Flock() {
        this.quackers = new ArrayList<>();
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            IQuackable quacker = (IQuackable) iterator.next();
            quacker.quack();
        }
    }

    public void add(IQuackable quacker) {
        quackers.add(quacker);
    }
}
