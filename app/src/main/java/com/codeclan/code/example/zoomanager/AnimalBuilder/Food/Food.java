package com.codeclan.code.example.zoomanager.AnimalBuilder.Food;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

/**
 * Created by user on 29/05/2017.
 */

public class Food implements Edible {
    private String name;
    private int calorificValue;
    private int weightInGrams;
    Animalable.FeedingBehaviour type;

    public Food (String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCalorificValue() {
        return this.calorificValue;
    }

    @Override
    public void setCalorificValue(int value) {
        this.calorificValue = value;
    }

    @Override
    public int getWeightGrams() {
        return this.weightInGrams;
    }

    @Override
    public void setWeightGrams(int grams) {
        this.weightInGrams = grams;
    }

    @Override
    public Animalable.FeedingBehaviour getType() {
        return this.type;
    }

    @Override
    public void setType(Animalable.FeedingBehaviour type) {
        this.type = type;
    }

}
