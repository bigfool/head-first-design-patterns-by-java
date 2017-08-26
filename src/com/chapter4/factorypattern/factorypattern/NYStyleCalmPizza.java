package com.chapter4.factorypattern.factorypattern;

import com.chapter4.factorypattern.Pizza;

/**
 * Created by qizhenfang on 17/8/26.
 */
public class NYStyleCalmPizza extends Pizza {
    public NYStyleCalmPizza() {
        name = "NY Styple Calm Pizza";
        dough = "Dough";
        sauce = "Sauce";

        toppings.add("Grated Regginao Cheese");
    }
}
