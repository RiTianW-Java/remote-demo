package com.example.entity.DesignPatterns;

import com.example.entity.DesignPatterns.action.impl.ActionImpl;
import com.example.entity.DesignPatterns.action.impl.SoundImpl;

public class RealDuck extends Duck{

    public RealDuck() {
        this.actionInterface = new ActionImpl();
        this.soundInterface = new SoundImpl();
    }
}
