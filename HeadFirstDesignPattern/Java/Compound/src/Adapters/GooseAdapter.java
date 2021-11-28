package Adapters;

import Goose.Goose;
import Interfaces.IQuackable;

public class GooseAdapter implements IQuackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
