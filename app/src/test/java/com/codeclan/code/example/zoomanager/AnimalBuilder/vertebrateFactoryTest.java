package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class vertebrateFactoryTest {
    VertebrateFactory factory;

    @Before
    public void before(){
        factory = new VertebrateFactory();
    }
    @Test
    public void canCreateAnimal(){
        VertebrateFactory factory =  new VertebrateFactory();
        Animalable sardine = factory.createAnimal(Animalable.AnimalSubClass.FISH);
        assertEquals("FISH", sardine.getMySubClass().name());
    }

    @Test
    public void canGetClass(){
        VertebrateFactory factory =  new VertebrateFactory();
        Animalable dog = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        assertEquals("VERTEBRATE", dog.getMyClass().name());
    }

    @Test
    public void canGetSex(){
        VertebrateFactory factory =  new VertebrateFactory();
        Animalable dog = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        dog.setMySex(Animalable.Sex.MALE);
        assertEquals("MALE", dog.getMySex().name());
    }

    @Test
    public void canCreteAmphibian(){
        Animalable frog = factory.createAnimal(Animalable.AnimalSubClass.AMPHIBIAN);
        assertEquals("AMPHIBIAN", frog.getMySubClass().name());
    }

    @Test
    public void canCreteBird(){
        Animalable woodpecker = factory.createAnimal(Animalable.AnimalSubClass.BIRD);
        assertEquals("BIRD", woodpecker.getMySubClass().name());
    }

    @Test
    public void canCreteReptile(){
        Animalable snake = factory.createAnimal(Animalable.AnimalSubClass.REPTILE);
        assertEquals("REPTILE", snake.getMySubClass().name());
    }
}