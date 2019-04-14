package template;

public abstract class Record {
    //Invert of Control
    //Template Method
    public void save(){
        validate();
        beforeSave();
        //TODO: Query DB to Save
        System.out.println("TODO: Query DB to Save");
        afterSave();
    }
    public abstract void validate();

    //Can have default behaviour -> virtual method
    public void beforeSave(){
        System.out.println("default beforeSave");
    }

    public abstract void afterSave();

    public abstract void failSave();
}
