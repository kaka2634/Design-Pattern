package command.Impl;

import command.ICommand;
import command.Light;

public class LightOffCommand implements ICommand {
    //Save receiver instance
    Light light;

    //Constructor inject Receiver
    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void unexecute() {
        this.light.on();
    }
}
