import Receiver.GarageDoor;

public class GarageDoorOffCommand implements ICommand {
    GarageDoor garageDoor;
    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.LightOff();
        garageDoor.down();
    }
}