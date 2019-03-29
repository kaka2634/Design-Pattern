package strategy.impl;

import strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}
