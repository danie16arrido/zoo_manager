package com.codeclan.code.example.zoomanager.ZooKeeper;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Food;
import com.codeclan.code.example.zoomanager.AnimalBuilder.VertebrateFactory;
import com.codeclan.code.example.zoomanager.Enclosure.Enclosure;
import com.codeclan.code.example.zoomanager.Person.Person;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Describable;

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

    Person visitor;
    Person visitor1;
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
        visitor = new Person("daniel", 40, 100);
        visitor1 = new Person("John", 30, 20);
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

    @Test
    public void canAddVisitors(){
        assertEquals(true, Edinburgh.addVisitor(visitor));
        assertEquals(1, Edinburgh.getNumberOfVisitors());
    }

    @Test
    public void canChargeVisitors(){
        Edinburgh.addVisitor(visitor);
        assertEquals(83, visitor.getWallet(), 0.01);
    }

    @Test
    public void canAddToZooCoffer(){
        Edinburgh.addVisitor(visitor);
        assertEquals(17, Edinburgh.getCoffers(), 0.01);
    }

    @Test
    public void canSetGetMaxCapacity(){
        Edinburgh.setMaxCapacity(4);
        assertEquals(4, Edinburgh.getMaxCapacity());
    }

    @Test
    public void canRefuseVisitorsWhenFull(){
        Edinburgh.setMaxCapacity(1);
        Edinburgh.addVisitor(visitor);

        assertEquals(false, Edinburgh.addVisitor(visitor1));
        assertEquals(1, Edinburgh.getNumberOfVisitors());

    }

    @Test
    public void canChargeChildrenFee(){
        Edinburgh.setMaxCapacity(22);
        visitor.setAge(10);
        Edinburgh.addVisitor(visitor);
        assertEquals(86, visitor.getWallet(), 0.01);
    }

    @Test
    public void canChargeSeniorFee(){
        Edinburgh.setMaxCapacity(22);
        visitor.setAge(61);
        Edinburgh.addVisitor(visitor);
        assertEquals(88, visitor.getWallet(), 0.01);
    }

}