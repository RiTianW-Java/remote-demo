package com.example.entity.BuilderPattern;

import com.example.entity.BuilderPattern.meal.ChickenBurger;
import com.example.entity.BuilderPattern.meal.Coke;
import com.example.entity.BuilderPattern.meal.Pepsi;
import com.example.entity.BuilderPattern.meal.VegBurger;

public class MealBuilder {

    public Meal MealOne() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal MealTwo() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
