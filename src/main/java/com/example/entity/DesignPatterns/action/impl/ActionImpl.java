package com.example.entity.DesignPatterns.action.impl;

import com.example.entity.DesignPatterns.action.ActionInterface;

public class ActionImpl implements ActionInterface {
    @Override
    public void fly() {
        System.out.println("I can fly...");
    }
}
