package command.Impl;

import command.ICommand;
import command.Light;

public class LightDownCommand implements ICommand {
    //Save receiver instance
    Light light;

    //Constructor inject Receiver
    public LightDownCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.down();
    }

    @Override
    public void unexecute() {
        this.light.up();
    }
}
