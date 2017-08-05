package com.chapter1.strategypattern;

/**
 * Created by qizhenfang on 17/8/5.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
