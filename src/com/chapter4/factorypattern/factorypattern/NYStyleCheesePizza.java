package com.chapter4.factorypattern.factorypattern;

import com.chapter4.factorypattern.Pizza;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Styple Cheeese Pizza";
        dough = "Dough";
        sauce = "Sauce";

        toppings.add("Grated Regginao Cheese");
    }
}
