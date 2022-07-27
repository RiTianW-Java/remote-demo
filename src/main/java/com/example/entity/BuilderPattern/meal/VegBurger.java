package com.example.entity.BuilderPattern.meal;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 25.0f;
    }
}
