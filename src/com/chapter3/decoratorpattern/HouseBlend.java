package com.chapter3.decoratorpattern;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "Hourse Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}
