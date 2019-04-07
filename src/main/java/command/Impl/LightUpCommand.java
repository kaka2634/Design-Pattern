package command.Impl;

import command.ICommand;
import command.Light;

public class LightUpCommand implements ICommand {
    //Save receiver instance
    Light light;

    //Constructor inject Receiver
    public LightUpCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.up();
    }

    @Override
    public void unexecute() {
        this.light.down();
    }
}
