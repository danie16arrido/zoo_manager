package com.codeclan.code.example.zoomanager.AnimalBuilder.SubClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;

/**
 * Created by user on 27/05/2017.
 */

public abstract class Mammal extends Animal {

    public Mammal(){
        super();
        setMyClass(AnimalClass.VERTEBRATE);
        setMySubClass(AnimalSubClass.MAMMAL);
    }
}
