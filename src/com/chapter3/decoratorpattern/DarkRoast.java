package com.chapter3.decoratorpattern;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast coffee";
    }

    public double cost() {
        return 0.89;
    }
}
