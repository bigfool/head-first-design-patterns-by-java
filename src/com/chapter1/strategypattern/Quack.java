package com.chapter1.strategypattern;

/**
 * Created by qizhenfang on 17/8/5.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
