import Receiver.TV;

public class TelevisionOnCommand implements ICommand{
    private TV television;
    public TelevisionOnCommand(TV television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.on();
        television.setInputChannel();
        television.setVolume();
    }
}
