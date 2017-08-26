package com.chapter4.factorypattern.factorypattern;

import com.chapter4.factorypattern.Pizza;

/**
 * Created by qizhenfang on 17/8/26.
 */
public abstract class PizzaStore2 {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
