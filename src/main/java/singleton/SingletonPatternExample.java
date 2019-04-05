package singleton;

public class SingletonPatternExample {
    public static void main(String args[]){
        //Use class method to getInstance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1 == singleton2) {
            System.out.print("singleton1 and singleton2 point to same instance");
        }
    }
}
