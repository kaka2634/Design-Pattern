package state;

public class StatePatternExample {
    public static void main(String[] args) {
        Gate gate = new Gate();
        System.out.println(gate.getState().toString());
        gate.payOk();
        System.out.println(gate.getState().toString());
        gate.enter();
        System.out.println(gate.getState().toString());
        gate.payFailed();
        System.out.println(gate.getState().toString());
    }
}
