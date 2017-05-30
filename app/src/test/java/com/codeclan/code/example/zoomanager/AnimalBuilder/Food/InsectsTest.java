package com.codeclan.code.example.zoomanager.AnimalBuilder.Food;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class InsectsTest {

    public class Insects extends Food{
        public Insects(String name) {
            super(name);
        }

    }
    Insects fly;

    @Before
    public void before(){
        fly = new Insects("fly");
    }
    @Test
    public void canGetName() throws Exception {
        assertEquals("fly", fly.getName());
    }

    @Test
    public void canSetName(){
        fly.setName("Ant");
        assertEquals("Ant", fly.getName());
    }

    @Test
    public void canSetGetCalorificValue(){
        fly.setCalorificValue(100);
        assertEquals(100, fly.getCalorificValue());
    }

    @Test
    public void canGetSetWeight(){
        fly.setWeightGrams(200);
        assertEquals(200, fly.getWeightGrams());
    }

    @Test
    public void canGetSetType(){
        fly.type = Animalable.FeedingBehaviour.INSECTIVORE;
        assertEquals("INSECTIVORE", fly.getType().name());
    }

}