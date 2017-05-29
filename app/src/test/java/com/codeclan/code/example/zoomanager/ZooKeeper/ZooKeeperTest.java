package com.codeclan.code.example.zoomanager.ZooKeeper;

import android.os.health.TimerStat;
import android.provider.Settings;
import android.util.Log;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.VertebrateFactory;
import com.codeclan.code.example.zoomanager.Enclosure.Enclosure;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintWriter;
import java.sql.Time;
import java.sql.Timestamp;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class ZooKeeperTest {
    ZooKeeper Edinburgh;
    VertebrateFactory factory;
    Animalable animalTest;
    public class standardEnclosure extends Enclosure{
    }
    standardEnclosure one = new standardEnclosure();

    @Before
    public void before(){
        Edinburgh = new ZooKeeper("EdinZoo");
        animalTest = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
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
        one.addAnimalToEnclosure(animalTest);
        animalTest.setFeedingPeriod(4);
        //set last feed time six hour earlier
        Timestamp earlier = new Timestamp(System.currentTimeMillis() - 21600000);
        animalTest.feedMe(earlier);
        assertEquals(true, animalTest.timeToFeed());
        ZooKeeper.feedAnimalInCage(one);
        assertEquals(false, animalTest.timeToFeed());
    }

}