package com.example.entity.DesignPatterns.action.impl;

import com.example.entity.DesignPatterns.action.SoundInterface;

public class SoundNoImpl implements SoundInterface {
    @Override
    public void sound() {
        System.out.println("I can`t sing...");
    }
}
