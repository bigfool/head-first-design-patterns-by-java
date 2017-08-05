package com.chapter1.strategypattern;

/**
 * Created by qizhenfang on 17/8/5.
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
