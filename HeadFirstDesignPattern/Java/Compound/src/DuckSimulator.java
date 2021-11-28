import Adapters.GooseAdapter;
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
        
        Goose goose = new Goose();
        IQuackable gooseDuck = new GooseAdapter(goose);

        System.out.println("\nDuck Simulator: With Decorator and Abstract Factory\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(gooseDuck);

        System.out.println("Ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private static void simulate(IQuackable duck) {
        duck.quack();
    }
}
