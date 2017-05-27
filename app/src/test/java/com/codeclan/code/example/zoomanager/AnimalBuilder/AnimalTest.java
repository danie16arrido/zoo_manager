package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalTest {
    Mammal animal;
    @Before
    public  void before(){

        animal = new Mammal();
    }

    @Test
    public void canGetClass(){
        animal.setMyClass(Animalable.AnimalClass.VERTEBRATE);
        assertEquals("VERTEBRATE", animal.getMyClass().name());
    }

    @Test
    public void canSetClass(){
        animal.setMyClass(Animalable.AnimalClass.VERTEBRATE);
        assertEquals("VERTEBRATE", animal.getMyClass().name());
    }

    @Test
    public void canGetSubClass(){
        animal.setSubClass(Animalable.AnimalSubClass.MAMMAL);
        assertEquals("MAMMAL", animal.getMySubClass().name());
    }

    @Test
    public void canSetSubClass(){
        animal.setSubClass(Animalable.AnimalSubClass.FISH);
        assertEquals("FISH", animal.getMySubClass().name());
    }

    @Test
    public void canGetConsumption(){
        animal.setMyConsumption(Animalable.Consumption.CARNIVORE);
    assertEquals("CARNIVORE", animal.getMyConsumption().name());
    }

    @Test
    public void canSetConsumption(){
        animal.setMyConsumption(Animalable.Consumption.OMNIVORE);
        assertEquals("OMNIVORE", animal.getMyConsumption().name());
    }

    @Test
    public void canGetMediaNotSet(){
        assertEquals(0, animal.getMyMedia().size());
    }

    @Test
    public void canSetMedia(){
        animal.addMedia(Animalable.Media.WATER);
        assertEquals(1, animal.getMyMedia().size());
    }

    @Test
    public void canGetMediaName(){
        animal.addMedia(Animalable.Media.WATER);
        assertEquals("WATER", animal.getMyMedia().get(0).name());
    }

    @Test
    public void canGetMotionNotSet(){
        assertEquals(0, animal.getMyMotion().size());
    }

    @Test
    public void canAddMotion(){
        animal.addMotion(Animalable.Motion.CLIMB);
        assertEquals(1, animal.getMyMotion().size());
    }

    @Test
    public void canGetMotionName(){
        animal.addMotion(Animalable.Motion.CLIMB);
        assertEquals("CLIMB", animal.getMyMotion().get(0).name());
    }

    @Test
    public void canGetSetName(){
        animal.setName("Heidi");
        assertEquals("Heidi", animal.getName());
    }

    @Test
    public void canGetSetScientificName(){
        animal.setScientificName("Bufo Bufo");
        assertEquals("Bufo Bufo", animal.getScientificName());
    }

    @Test
    public void canGetSetCommonName(){
        animal.setCommonName("Eagle");
        assertEquals("Eagle", animal.getCommonName());
    }

    @Test
    public void canGetSetHazardousness(){
        animal.setHazardous(true);
        assertEquals(true, animal.amIHazardous());
    }

    @Test
    public void canGetSetMySex(){
        animal.setMySex(Animalable.Sex.FEMALE);
        assertEquals("FEMALE", animal.getMySex().name());
    }

}