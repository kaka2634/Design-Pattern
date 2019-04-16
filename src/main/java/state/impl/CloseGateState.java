package state.impl;

import state.Gate;
import state.GateState;

public class CloseGateState implements GateState {
    private Gate gate;
    public CloseGateState(Gate g){
        this.gate = g;
    }


    @Override
    public void enter() {
        //Do nothing
    }

    @Override
    public void payOk() {
        //Change gate status
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        //Do nothing
    }
}
