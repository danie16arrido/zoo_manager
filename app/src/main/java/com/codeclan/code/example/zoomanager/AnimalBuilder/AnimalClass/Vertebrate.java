package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

/**
 * Created by user on 28/05/2017.
 */

public abstract class Vertebrate extends Animal {
    public Vertebrate() {
        setMyClass(AnimalClass.VERTEBRATE);
    }
}
