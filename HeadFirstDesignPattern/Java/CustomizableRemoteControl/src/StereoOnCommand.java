import Receiver.Stereo;

public class StereoOnCommand implements ICommand{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume();
    }
}
