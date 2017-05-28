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
    public void setMyClass(AnimalClass animalClass);

    public AnimalSubClass getMySubClass();
    public void setMySubClass(AnimalSubClass animalSubClass);

    public Consumption getMyConsumption();
    public void setMyConsumption(Consumption myConsumption);

    public ArrayList<Media> getMyMedia();
    public void addMedia(Media aMedia);

    public ArrayList<Motion> getMyMotion();
    public void addMotion(Motion aMotion);

    public String getName();
    public void setName(String name);

    public String getCommonName();
    public void setCommonName(String commonName);

    public String getScientificName();
    public void setScientificName(String scientificName);

    public Boolean amIHazardous();
    public void setHazardous(boolean hazardous);

    public Sex getMySex();
    public void setMySex(Sex aSex);
}
