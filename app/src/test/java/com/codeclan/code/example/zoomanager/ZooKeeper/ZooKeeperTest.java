package com.codeclan.code.example.zoomanager.ZooKeeper;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Food;
import com.codeclan.code.example.zoomanager.AnimalBuilder.VertebrateFactory;
import com.codeclan.code.example.zoomanager.Enclosure.Enclosure;

import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class ZooKeeperTest {
    ZooKeeper Edinburgh;
    ZooKeeper Dundee;
    VertebrateFactory factory;
    Animalable animalTest;
    Animalable animalTest1;
    public class standardEnclosure extends Enclosure{
    }
    standardEnclosure one = new standardEnclosure();
    standardEnclosure two = new standardEnclosure();
    @Before
    public void before(){
        Edinburgh = new ZooKeeper("EdinZoo");
        Dundee = new ZooKeeper("Dundee");
        animalTest = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        animalTest1 = factory.createAnimal(Animalable.AnimalSubClass.FISH);
    }

    @Test
    public void canGetName(){
        assertEquals("EdinZoo", Edinburgh.getName());
    }

    @Test
    public void canSetName(){
        Edinburgh.setName("John");
        assertEquals("John", Edinburgh.getName());
    }

    @Test
    public void canKeepTrackOfEnclosures() {
        Edinburgh.addEnclosure(one);
        assertEquals(1, Edinburgh.getNumberOfEnclosures());
    }

    @Test
    public void canRemoveEnclousures(){
        Edinburgh.addEnclosure(one);
        assertEquals(1, Edinburgh.getNumberOfEnclosures());
        Enclosure oneTemp = Edinburgh.getEnclosures().get(0);
        Edinburgh.removeEnclosure(oneTemp);
        assertEquals(0, Edinburgh.getNumberOfEnclosures());
    }

    @Test
    public void canFeedAnimal(){
        Food food = new Food("food");
        food.setType(Animalable.FeedingBehaviour.INSECTIVORE);

        animalTest.setMyFeedingBehaviour(Animalable.FeedingBehaviour.INSECTIVORE);
        animalTest.setFeedingPeriod(4);

        one.addAnimalToEnclosure(animalTest);
        Edinburgh.addEnclosure(one);

        //set last feed time six hour earlier
        Timestamp earlier = new Timestamp(System.currentTimeMillis() - 21600000);
        animalTest.feedMe(earlier, food);

        assertEquals(true, animalTest.timeToFeed());

        Edinburgh.feedAnimalsInCage(Edinburgh.getEnclosures().get(0));
        assertEquals(false, animalTest.timeToFeed());
        System.out.print(one.getMaxCapacity());
    }

    @Test
    public void canTransferBabyAnimal(){
        animalTest.setAsBaby();
        one.addAnimalToEnclosure(animalTest);

        assertEquals(true, Edinburgh.transferBaby(one, animalTest, Dundee, two));
    }

}