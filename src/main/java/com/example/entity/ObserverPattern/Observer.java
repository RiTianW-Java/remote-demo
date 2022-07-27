package com.example.entity.ObserverPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}