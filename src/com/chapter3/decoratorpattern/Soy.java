package com.chapter3.decoratorpattern;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}
