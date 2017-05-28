package com.codeclan.code.example.zoomanager.AnimalBuilder;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Amphibian;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Bird;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Fish;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Reptile;

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
            case AMPHIBIAN:
                class aAmphibian extends Amphibian {};
                return new aAmphibian();
            case REPTILE:
                class aReptile extends Reptile {};
                return new aReptile();
            case BIRD:
                class aBird extends Bird {};
                return new aBird();

            default:
                return null;
        }
    }
}
