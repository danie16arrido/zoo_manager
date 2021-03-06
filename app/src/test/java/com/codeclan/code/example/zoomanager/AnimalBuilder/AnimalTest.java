package com.codeclan.code.example.zoomanager.AnimalBuilder;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Food;

import org.junit.Before;
import org.junit.Test;


import java.sql.Timestamp;
import java.util.Date;


import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class AnimalTest {

    public class Lion extends Animal{}
    Lion animal;
    public class Insects extends Food{
        public Insects(String name) {
            super(name);
        }
    }
    Insects fly;
    @Before
    public  void before(){
        animal = new Lion();
        fly = new Insects("fly");
        fly.setType(Animalable.FeedingBehaviour.INSECTIVORE);
        fly.setWeightGrams(200);
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
        animal.setMySubClass(Animalable.AnimalSubClass.MAMMAL);
        assertEquals("MAMMAL", animal.getMySubClass().name());
    }

    @Test
    public void canSetSubClass(){
        animal.setMySubClass(Animalable.AnimalSubClass.FISH);
        assertEquals("FISH", animal.getMySubClass().name());
    }

    @Test
    public void canGetFeedingBehaviour(){
        animal.setMyFeedingBehaviour(Animalable.FeedingBehaviour.CARNIVORE);
//        animal.setMyFeedingBehaviour(new FeedingBehaviour.);
        assertEquals("CARNIVORE", animal.getMyFeedingBehaviour().name());
    }

    @Test
    public void canSetFeedingBehaviour(){
        animal.setMyFeedingBehaviour(Animalable.FeedingBehaviour.OMNIVORE);
        assertEquals("OMNIVORE", animal.getMyFeedingBehaviour().name());
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

    @Test
    public void canGetLastTimeFeed(){
        Food food = new Food("food");
        Timestamp now = new Timestamp(System.currentTimeMillis());
        animal.feedMe(now, food);
        assertEquals(now, animal.getLastTimeFed());
    }

    @Test
    public void canGetFeedPeriod(){
        animal.setFeedingPeriod(24);
        assertEquals(24, animal.getFeedingPeriod());
    }

    @Test
    public void canCheckFeedingTime(){
        Food food = new Food("food");
        animal.setFeedingPeriod(0);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        animal.feedMe(now, food);
        assertEquals(false, animal.timeToFeed());
    }

    @Test
    public void canFeedAnimal(){
        Timestamp now = new Timestamp(System.currentTimeMillis());
        animal.feedMe(now, fly);
    }

    @Test
    public void canEat(){
        Timestamp now = new Timestamp(System.currentTimeMillis());
        animal.feedMe(now, fly);
        assertEquals(1, animal.howFullIsMyBelly());
    }

    @Test
    public void isAdult(){
        animal.setAsAdult();
        assertEquals(true, animal.isAdult());
    }

    @Test
    public void isBaby(){
        animal.setAsBaby();
        assertEquals(false, animal.isAdult());
    }

}