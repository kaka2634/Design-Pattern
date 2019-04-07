package command;

public class Invoker {
    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;


    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down){
        this.on = on;
        this.down = down;
        this.off = off;
        this.up = up;
    }

    public void lightOn(){
        this.on.execute();
    }

    public void lightOff(){
        this.off.execute();
    }
    public void lightUp(){
        this.up.execute();
    }
    public void lightDown(){
        this.down.execute();
    }

}
