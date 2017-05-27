package com.codeclan.code.example.zoomanager.AnimalBuilder;

import android.content.Context;

import java.util.ArrayList;
import java.util.PriorityQueue;

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

    public enum Motion{
        SWIM,
        CRAWL,
        CLIMB,
        RUN,
        WALK,
        JUMP,
        FLY
    }

    public enum Consumption {
        AUTOTROPH,
        CARNIVORE,
        ERGIVORE,
        HERBIVORE,
        OMNIVORE,
        SCAVENGER
    }

    public enum Media {
        AIR,
        EARTH,
        WATER
    }

    public enum Sex {
        MALE,
        FEMALE,
        HERMAPHRODITE
    }



    public AnimalClass getMyClass();
    public AnimalSubClass getMySubClass();
    public Consumption getMyConsumption();
    public ArrayList<Media> getMyMedia();
    public ArrayList<Motion> getMyMotion();
    public String getName();
    public String getCommonName();
    public String getScientificName();
    public Boolean amIHazardous();
    public Sex getMySex();
}
