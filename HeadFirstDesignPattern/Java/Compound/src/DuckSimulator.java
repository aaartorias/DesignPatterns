import Adapters.GooseAdapter;
import Composite.Flock;
import Decorator.QuackCounter;
import Ducks.DuckCall;
import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
import Factory.CountingDuckFactory;
import Goose.Goose;
import Interfaces.IAbstractDuckFactory;
import Interfaces.IQuackable;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        IAbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private static void simulate(IAbstractDuckFactory duckFactory) {

        IQuackable mallardDuck = duckFactory.createMallardDuck();
        IQuackable redHeadDuck = duckFactory.createRedHeadDuck();
        IQuackable rubberDuck = duckFactory.createRubberDuck();
        IQuackable duckCall = duckFactory.createDuckCall();
        IQuackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        IQuackable mallardOne = duckFactory.createMallardDuck();
        IQuackable mallardTwo = duckFactory.createMallardDuck();
        IQuackable mallardThree = duckFactory.createMallardDuck();
        IQuackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Decorator and Abstract Factory: Flock as composite of ducks\n");
        simulate(flockOfDucks);
        simulate(flockOfMallards);

        System.out.println("Ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private static void simulate(IQuackable duck) {
        duck.quack();
    }
}
