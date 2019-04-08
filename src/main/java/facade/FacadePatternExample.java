package facade;

public class FacadePatternExample {
    public static void main(String args[]){
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
