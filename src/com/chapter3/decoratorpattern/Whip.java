package com.chapter3.decoratorpattern;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 1 + beverage.cost();
    }
}
