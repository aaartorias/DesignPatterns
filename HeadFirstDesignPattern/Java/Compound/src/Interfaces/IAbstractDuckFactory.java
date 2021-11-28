package Interfaces;

import Interfaces.IQuackable;

public interface IAbstractDuckFactory {
    IQuackable createMallardDuck();
    IQuackable createRedHeadDuck();
    IQuackable createRubberDuck();
    IQuackable createDuckCall();
}
