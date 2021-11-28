import Adapters.GooseAdapter;
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
        IQuackable mallardDuck = new MallardDuck();
        IQuackable redHeadDuck = new RedHeadDuck();
        IQuackable rubberDuck = new RubberDuck();
        IQuackable duckCall = new DuckCall();
        Goose goose = new Goose();
        IQuackable gooseDuck = new GooseAdapter(goose);

        System.out.println("\nDuck Simulator\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(gooseDuck);
    }

    private static void simulate(IQuackable duck) {
        duck.quack();
    }
}
