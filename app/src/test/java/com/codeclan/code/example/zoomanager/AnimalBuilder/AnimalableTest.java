package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalableTest {
    @Test
    public void canGetClassName(){
        Animalable.AnimalClass aClass = Animalable.AnimalClass.VERTEBRATE;
        assertEquals("VERTEBRATE", aClass.name());
    }

}