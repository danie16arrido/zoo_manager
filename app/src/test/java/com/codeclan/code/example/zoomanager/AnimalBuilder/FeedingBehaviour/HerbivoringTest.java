package com.codeclan.code.example.zoomanager.AnimalBuilder.FeedingBehaviour;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class HerbivoringTest {
    public class Horse extends Mammal implements Herbivoring {
        public Horse(){
            iAmHerbivore();
        }
        @Override
        public void iAmHerbivore() {
            setMyFeedingBehaviour(FeedingBehaviour.HERBIVORE);
        }
    }
    Horse quickDraw;

    @Before
    public void before(){
        quickDraw = new Horse();
    }

    @Test
    public void isHerbivore(){
        assertEquals("HERBIVORE", quickDraw.getMyFeedingBehaviour().name());
    }

}