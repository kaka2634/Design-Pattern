package strategy;

import strategy.impl.FlyNoWay;
import strategy.impl.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //Specific the concreate strategy -> For this step, consider IOC
        QuackBehavior qb = new MuteQuack();
        FlyBehavior fb = new FlyNoWay();
        //Create specific instance of Duck so that there is no need for inheritance of Duck class
        Duck modelDuck = new Duck(fb,qb);
        //Call specific strategy
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
