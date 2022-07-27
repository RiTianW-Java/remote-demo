package com.example.entity.DesignPatterns;

import com.example.entity.DesignPatterns.action.impl.ActionNoImpl;
import com.example.entity.DesignPatterns.action.impl.SoundNoImpl;

public class ModelDuck extends Duck{

    public ModelDuck () {
        this.actionInterface = new ActionNoImpl();
        this.soundInterface = new SoundNoImpl();
    }
}
