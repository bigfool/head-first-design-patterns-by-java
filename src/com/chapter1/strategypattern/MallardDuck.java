package com.chapter1.strategypattern;

/**
 * Created by qizhenfang on 17/8/5.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
