package bridge;

//Abstraction
public abstract class View {
    protected IResource resource;

    public View(IResource r) {
        this.resource = r;
    }

    public abstract String show();
}
