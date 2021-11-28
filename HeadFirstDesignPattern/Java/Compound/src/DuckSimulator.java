import Adapters.GooseAdapter;
import Decorator.QuackCounter;
import Ducks.DuckCall;
import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
import Goose.Goose;
import Interfaces.IQuackable;

public class DuckSimulator {

    public static void main(String[] args) {
        //DuckSimulator simulator = new DuckSimulator(); simulator.simulate()
        simulate();
    }

    private static void simulate() {
        IQuackable mallardDuck = new QuackCounter(new MallardDuck());
        IQuackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        IQuackable rubberDuck = new QuackCounter(new RubberDuck());
        IQuackable duckCall = new QuackCounter(new DuckCall());
        Goose goose = new Goose();
        IQuackable gooseDuck = new GooseAdapter(goose);

        System.out.println("\nDuck Simulator: With Decorator\n");

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
