import Receiver.CeilingFan;
public class FanOnCommand implements ICommand{
    private final int OFF = 0;
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;

    private CeilingFan fan;
    public FanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        if (fan.getState() == OFF) {
            fan.low();
        } else if (fan.getState() == LOW) {
            fan.mid();
        } else if (fan.getState() == MEDIUM) {
            fan.high();
        } else if (fan.getState() == HIGH) {
            fan.low();
        }
    }
}
