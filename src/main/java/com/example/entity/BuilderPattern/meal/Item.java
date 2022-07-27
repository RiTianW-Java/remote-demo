package com.example.entity.BuilderPattern.meal;

import com.example.entity.BuilderPattern.packing.Packing;

public interface Item {

    String name();
    Packing packing();
    double price();

}