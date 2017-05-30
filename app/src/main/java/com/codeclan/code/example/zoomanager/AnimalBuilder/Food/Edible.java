package com.codeclan.code.example.zoomanager.AnimalBuilder.Food;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

/**
 * Created by user on 29/05/2017.
 */

public interface Edible {
    public String getName();
    public void setName(String name);

    public int getCalorificValue();
    public void setCalorificValue(int value);

    public int getWeightGrams();
    public void setWeightGrams(int grams);

    public Animalable.FeedingBehaviour getType();
    public void setType(Animalable.FeedingBehaviour type);
}
