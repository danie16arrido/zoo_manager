package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class animalFactoryTest {
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
}