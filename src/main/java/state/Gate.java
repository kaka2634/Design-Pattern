package state;

import state.impl.CloseGateState;

public class Gate {
    private GateState state;

    //Use default constructor to set initial state
    public Gate(){
        this.state = new CloseGateState(this);
    }

    //Delegate down to state -> using polymorphism
    public void enter(){
        this.state.enter();
    }
    public void payOk(){
        this.state.payOk();
    }
    public void payFailed(){
        this.state.payFailed();
    }

    //Change State for State change gate
    //This is mutation way
    //For immutation, we can use return state for enter,payOk, payFailed method, and gate change its state itself
    public void changeState(GateState state){
        this.state = state;
    }

    public GateState getState(){
        return this.state;
    }
}
