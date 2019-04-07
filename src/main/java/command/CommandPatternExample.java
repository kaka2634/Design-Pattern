package command;

import command.Impl.LightDownCommand;
import command.Impl.LightOffCommand;
import command.Impl.LightOnCommand;
import command.Impl.LightUpCommand;

public class CommandPatternExample {
    public static void main(String args[]){
        Light light = new Light();

        Invoker invoker = new Invoker(new LightOnCommand(light),new LightOffCommand(light),new LightUpCommand(light),new LightDownCommand(light));
        invoker.lightOn();
        invoker.lightDown();
        invoker.lightUp();
        invoker.lightOff();

    }
}
