import Receiver.GarageDoor;

public class GarageDoorOnCommand implements ICommand {
    GarageDoor garageDoor;
    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.LightOn();
    }
}
