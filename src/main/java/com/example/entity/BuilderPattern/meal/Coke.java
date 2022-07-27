package com.example.entity.BuilderPattern.meal;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 10.0f;
    }
}
