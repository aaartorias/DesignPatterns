import Ducks.DuckCall;
import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
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

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
    }

    private static void simulate(IQuackable duck) {
        duck.quack();
    }
}
