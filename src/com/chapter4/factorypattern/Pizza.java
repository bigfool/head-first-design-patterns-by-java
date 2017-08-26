package com.chapter4.factorypattern;

import java.util.ArrayList;

/**
 * Created by qizhenfang on 17/8/26.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Prepareing " + name );
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake Pizza");
    }

    public void cut() {
        System.out.println("Cut Pizza");
    }

    public void box() {
        System.out.println("Box Pizza");
    }

    public String getName() {
        return name;
    }
}
