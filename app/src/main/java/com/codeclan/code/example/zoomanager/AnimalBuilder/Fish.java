package com.codeclan.code.example.zoomanager.AnimalBuilder;

/**
 * Created by user on 28/05/2017.
 */

public class Fish extends Animal {
    public Fish(){
        super();
        setMyClass(AnimalClass.VERTEBRATE);
        setMySubClass(AnimalSubClass.FISH);
        addMotion(Motion.SWIM);
        addMedia(Media.WATER);
    }
}