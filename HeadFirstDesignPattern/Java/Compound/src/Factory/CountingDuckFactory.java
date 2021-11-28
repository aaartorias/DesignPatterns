package Factory;

import Decorator.QuackCounter;
import Ducks.DuckCall;
import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
import Interfaces.IAbstractDuckFactory;
import Interfaces.IQuackable;

public class CountingDuckFactory implements IAbstractDuckFactory {
    @Override
    public IQuackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public IQuackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public IQuackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public IQuackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
