package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalTest {
    Animal animal;
    @Before
    public  void before(){
        animal = new Animal(Animalable.AnimalClass.VERTEBRATE, Animalable.AnimalSubClass.MAMMAL);
    }

    @Test @Ignore
    public void canGetClass(){
        assertEquals("VERTEBRATE", animal.getMyClass());
    }

    @Test @Ignore
    public void canSetClass(){
        animal.setMyClass(Animalable.AnimalClass.VERTEBRATE);
        assertEquals("VERTEBRATE", animal.getMyClass());
    }

    @Test
    public void canGetSubClass(){
        assertEquals("MAMMAL", animal.getMySubClass().name());
    }

    @Test
    public void canSetSubClass(){
        animal.setSubClass(Animalable.AnimalSubClass.FISH);
        assertEquals("FISH", animal.getMySubClass().name());
    }

}