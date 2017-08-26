package com.chapter4.factorypattern.factorypattern;

import com.chapter4.factorypattern.Pizza;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class PizzaTestDriver {
    public static void main (String[] args) {
        PizzaStore2 nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Order a " + pizza.getName());
    }
}
