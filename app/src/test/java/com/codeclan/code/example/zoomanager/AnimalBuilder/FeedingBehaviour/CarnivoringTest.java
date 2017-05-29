package com.codeclan.code.example.zoomanager.AnimalBuilder.FeedingBehaviour;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class CarnivoringTest {

    public class Lion extends Mammal implements Carnivoring{
        public Lion(){
            iAmCarnivore();
        }
        @Override
        public void iAmCarnivore() {
            setMyFeedingBehaviour(FeedingBehaviour.CARNIVORE);
        }
    }
    Lion simba;

    @Before
    public void before(){
        simba = new Lion();
    }

    @Test
    public void isEatMeater(){
        assertEquals("CARNIVORE", simba.getMyFeedingBehaviour().name() );
    }

}