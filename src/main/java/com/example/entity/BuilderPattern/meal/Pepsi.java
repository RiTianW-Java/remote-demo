package com.example.entity.BuilderPattern.meal;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 8.0f;
    }
}
