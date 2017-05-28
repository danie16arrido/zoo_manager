package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class animalFactoryTest {
    animalFactory factory;

    @Before
    public void before(){
        factory = new animalFactory();
    }
    @Test
    public void canCreateAnimal(){
        animalFactory factory =  new animalFactory();
        Animalable sardine = factory.createAnimal(Animalable.AnimalSubClass.FISH);
        assertEquals("FISH", sardine.getMySubClass().name());
    }

    @Test
    public void canGetClass(){
        animalFactory factory =  new animalFactory();
        Animalable dog = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        assertEquals("VERTEBRATE", dog.getMyClass().name());
    }

    @Test
    public void canGetSex(){
        animalFactory factory =  new animalFactory();
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