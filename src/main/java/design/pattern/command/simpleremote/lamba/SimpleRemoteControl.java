package design.pattern.command.simpleremote.lamba;

public class SimpleRemoteControl {

    Command button;

    public void setCommand(Command command) {
        this.button = command;
    }

    public void buttonWasPressed() {
        button.execute();
    }

}
