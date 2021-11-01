import Receiver.*;

public class RemoteControllerEmulator {
    public static void main(String[] args) {

        // Receiver objects mimicking vendor class
        Light light = new Light("Living Room Light");
        Stereo stereo = new Stereo("Home Stereo");
        CeilingFan fan = new CeilingFan("Hall Ceiling Fan");
        GarageDoor garageDoor = new GarageDoor("Garage Door");
        TV television = new TV("Living Room Television");

        // Commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);

        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(television);
        TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(television);

        // Build Remote control
        RemoteControl remote = new RemoteControl();
        remote.setCommand(1, lightOnCommand, lightOffCommand);
        remote.setCommand(2, stereoOnCommand, stereoOffCommand);
        remote.setCommand(3, televisionOnCommand, televisionOffCommand);
        remote.setCommand(4, garageDoorOnCommand, garageDoorOffCommand);
        remote.setCommand(5, fanOnCommand, fanOffCommand);

        // User Remote
        remote.onButtonPressed(5);
        remote.offButtonPressed(5);

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        remote.onButtonPressed(2);
        remote.offButtonPressed(2);

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);

        remote.onButtonPressed(4);
        remote.offButtonPressed(4);

        remote.onButtonPressed(6);
        remote.offButtonPressed(6);

    }
}
