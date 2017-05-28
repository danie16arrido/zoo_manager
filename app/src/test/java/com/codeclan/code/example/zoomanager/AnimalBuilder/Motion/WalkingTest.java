package com.codeclan.code.example.zoomanager.AnimalBuilder.Motion;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass.Vertebrate;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class WalkingTest {
    public abstract class Bear extends Vertebrate {}

    public class ClimbingBear extends Bear implements Walking, Climbing{
        public ClimbingBear(){
            iClimb(Motion.CLIMB);
            iWalk(Motion.WALK);
        }

        @Override
        public void iClimb(Motion climb) {
            addMotion(climb);
        }

        @Override
        public void iWalk(Motion walk) {
            addMotion(walk);
        }
    }
    ClimbingBear balu;

    @Before
    public void before(){
        balu = new ClimbingBear();
    }

    @Test
    public void iWalk() throws Exception {
        assertEquals(true, balu.getMyMotion().contains(Animalable.Motion.WALK));
    }

}