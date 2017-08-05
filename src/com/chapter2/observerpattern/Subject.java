package com.chapter2.observerpattern;

/**
 * Created by qizhenfang on 17/8/5.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
