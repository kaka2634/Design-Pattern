package command;

public interface ICommand {
    //return is void
    //If want to save result, use private member and implement getResult()
    void execute();
    void unexecute();
}
