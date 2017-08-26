package com.chapter3.decoratorpattern;

/**
 * Created by qizhenfang on 17/8/26.
 */
public abstract class Beverage {
    String description = "Unkown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
