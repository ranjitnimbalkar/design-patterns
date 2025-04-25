package design.pattern.command.simpleremote.lamba;


import design.pattern.command.simpleremote.GarageDoor;

public class RemoteControlTestWithLambda {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        remote.setCommand(light::on);
        remote.buttonWasPressed();

        remote.setCommand(light::off);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
    }

}
