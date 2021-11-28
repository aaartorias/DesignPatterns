package Factory;

import Ducks.DuckCall;
import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
import Interfaces.IAbstractDuckFactory;
import Interfaces.IQuackable;

public class DuckFactory implements IAbstractDuckFactory {
    @Override
    public IQuackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public IQuackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public IQuackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public IQuackable createDuckCall() {
        return new DuckCall();
    }
}
