package state.impl;

import state.Gate;
import state.GateState;

public class OpenGateState implements GateState {
    private Gate gate;
    public OpenGateState(Gate g){
        this.gate = g;
    }

    @Override
    public void enter() {
        this.gate.changeState(new CloseGateState(this.gate));
    }

    @Override
    public void payOk() {
        //Do nothing
    }

    @Override
    public void payFailed() {
        //Do nothing
    }
}
