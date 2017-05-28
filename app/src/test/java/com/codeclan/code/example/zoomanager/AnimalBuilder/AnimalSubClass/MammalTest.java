package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class MammalTest {
    public class Lion extends Mammal {

    }
    Lion lion;
    @Before
    public void before(){
        lion = new Lion();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", lion.getMyClass().name());
    }

    @Test
    public void canSetSex(){
        lion.setMySex(Animalable.Sex.FEMALE);
        assertEquals("FEMALE", lion.getMySex().name());
    }
}