package com.codeclan.code.example.zoomanager.AnimalBuilder.SubClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;

/**
 * Created by user on 28/05/2017.
 */

public abstract class Fish extends Animal {
    public Fish(){
        super();
        setMyClass(AnimalClass.VERTEBRATE);
        setMySubClass(AnimalSubClass.FISH);
        addMotion(Motion.SWIM);
        addMedia(Media.WATER);
    }
}
