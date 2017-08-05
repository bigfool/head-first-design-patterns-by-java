package com.chapter1.strategypattern;

/**
 * Created by qizhenfang on 17/8/5.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
