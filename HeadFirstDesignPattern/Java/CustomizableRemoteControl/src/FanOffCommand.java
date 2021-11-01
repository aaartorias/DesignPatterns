import Receiver.CeilingFan;

public class FanOffCommand implements ICommand{
    CeilingFan fan;
    public FanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.off();
    }
}
