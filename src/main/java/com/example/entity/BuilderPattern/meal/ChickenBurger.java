package com.example.entity.BuilderPattern.meal;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public double price() {
        return 50.0f;
    }
}
