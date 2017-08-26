package com.chapter4.factorypattern.factorypattern;

import com.chapter4.factorypattern.Pizza;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class NYPizzaStore extends PizzaStore2 {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("calm")) {
            return new NYStyleCalmPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
