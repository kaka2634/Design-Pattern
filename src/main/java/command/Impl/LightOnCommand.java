package command.Impl;

import command.ICommand;
import command.Light;

public class LightOnCommand implements ICommand {

    //Save receiver instance
    Light light;

    //Constructor inject Receiver
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unexecute() {
        this.light.off();
    }
}
