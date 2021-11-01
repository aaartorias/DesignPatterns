public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private final int totalControls = 7;

    public RemoteControl() {
        onCommands = new ICommand[totalControls];
        offCommands = new ICommand[totalControls];
        ICommand noCommand = new NoCommand();

        for (int i = 0; i < totalControls; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    public void setCommand(int button, ICommand onCommand, ICommand offCommand) {
        onCommands[button-1] = onCommand;
        offCommands[button-1] = offCommand;
    }

    public void onButtonPressed(int button) {
        ICommand command = onCommands[button-1];
        command.execute();
    }

    public void offButtonPressed(int button) {
        ICommand command = offCommands[button-1];
        command.execute();
    }

}
