package com.example.entity.DesignPatterns.action.impl;

import com.example.entity.DesignPatterns.action.ActionInterface;

public class ActionNoImpl implements ActionInterface {
    @Override
    public void fly() {
        System.out.println("I can`t fly...");
    }
}
