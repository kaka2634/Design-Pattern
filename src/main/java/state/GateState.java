package state;

public interface GateState {
    void enter();
    void payOk();
    void payFailed();
}
