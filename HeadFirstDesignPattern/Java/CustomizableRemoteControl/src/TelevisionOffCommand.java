import Receiver.TV;

public class TelevisionOffCommand implements ICommand{
    private TV television;
    public TelevisionOffCommand(TV television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.off();
    }
}

