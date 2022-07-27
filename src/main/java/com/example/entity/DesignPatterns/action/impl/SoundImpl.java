package com.example.entity.DesignPatterns.action.impl;

import com.example.entity.DesignPatterns.action.SoundInterface;

public class SoundImpl implements SoundInterface {
    @Override
    public void sound() {
        System.out.println("I can sing...");
    }
}
