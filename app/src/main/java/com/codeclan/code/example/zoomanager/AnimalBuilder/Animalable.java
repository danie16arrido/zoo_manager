package com.codeclan.code.example.zoomanager.AnimalBuilder;

/**
 * Created by user on 27/05/2017.
 */

public interface Animalable {
    public enum AnimalClass {
        VERTEBRATE,
        INVERTEBRATE
    }

    public enum AnimalSubClass{
        REPTILE,
        FISH,
        AMPHIBIAN,
        BIRD,
        MAMMAL
    }

    public enum AnimalMotion{
        SWIM,
        CRAWL,
        CLIMB,
        RUN,
        WALK,
        JUMP,
        FLY
    }

    public AnimalClass getMyClass();
    public AnimalSubClass getMySubClass();
//    public Movable[] getMyMotion();
//
//    public String getMyName();
//    public String getMySciName();
//    public String amIHazardous();
}
