package com.chapter4.factorypattern.simplefactorypattern;

import com.chapter4.factorypattern.*;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("calm")) {
            pizza = new CalmPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
