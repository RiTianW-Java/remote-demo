package com.example.entity.DesignPatterns;

import com.example.entity.DesignPatterns.action.ActionInterface;
import com.example.entity.DesignPatterns.action.SoundInterface;

public abstract class Duck {
    ActionInterface actionInterface;
    SoundInterface soundInterface;

    public void fly() {
        actionInterface.fly();
    }

    public void sound() {
        soundInterface.sound();
    }

    public void setActionInterface(ActionInterface actionInterface) {
        this.actionInterface = actionInterface;
    }

    public void setSoundInterface(SoundInterface soundInterface) {
        this.soundInterface = soundInterface;
    }
}
