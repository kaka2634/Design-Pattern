package strategy;

//Class of Duck, Not using abstract, Use instance with different behavior to create duck
//Otherwise, it may need inheritance to create concrete Duck
public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    //This is the key for not inheriting the duck class
    //Use Construct to Inject different behavior
    //So that we can create differerent duck instance by giving different behavior arguments
    //No hard-code
    Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }
    //This may be the fundation for the concept of injection
    //We can also use set method to inject behaviors

    //Delegate Strategy
    public void performFly() {
        fb.fly();
    }

    public void performQuack() {
        qb.quack();
    }

    public void swim() {
        System.out.println("All duck can swim");
    }
}
