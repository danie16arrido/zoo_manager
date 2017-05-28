package com.codeclan.code.example.zoomanager.AnimalBuilder;

import com.codeclan.code.example.zoomanager.AnimalBuilder.SubClass.Fish;
import com.codeclan.code.example.zoomanager.AnimalBuilder.SubClass.Mammal;

/**
 * Created by user on 28/05/2017.
 */

public class animalFactory {

    public static Animalable createAnimal(Animalable.AnimalSubClass subClass){
        switch (subClass){
            case MAMMAL:
                class aMammal extends Mammal {};
                return new aMammal();
            case FISH:
                class aFish extends Fish {};
                return new aFish();
            default:
                return null;
        }
    }
}
