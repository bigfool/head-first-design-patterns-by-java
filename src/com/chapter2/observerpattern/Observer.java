package com.chapter2.observerpattern;

/**
 * Created by qizhenfang on 17/8/6.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
