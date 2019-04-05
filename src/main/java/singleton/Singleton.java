package singleton;

public class Singleton {

    //Step 1. Set constructor private access
    private Singleton(){}

    //Step 2. create class access method getInstance -> set static and public and return Singleton
    public static Singleton getInstance(){
        //Step 4. implement the logic to check if instance is null or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //Step 3. set static and private variable to save instance (no this pointer because is class based)
    private static Singleton instance;
}
