package com.example.entity.BuilderPattern.meal;

import com.example.entity.BuilderPattern.meal.Item;
import com.example.entity.BuilderPattern.packing.Packing;
import com.example.entity.BuilderPattern.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}
