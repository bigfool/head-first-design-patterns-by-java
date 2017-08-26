package com.chapter4.factorypattern.simplefactorypattern;

import com.chapter4.factorypattern.Pizza;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class TestPizza {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Order a " + pizza.getName());

    }
}
