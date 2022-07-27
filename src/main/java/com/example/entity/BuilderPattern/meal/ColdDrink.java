package com.example.entity.BuilderPattern.meal;

import com.example.entity.BuilderPattern.packing.Bottle;
import com.example.entity.BuilderPattern.packing.Packing;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
