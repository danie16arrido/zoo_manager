package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class RodentiaTest {
    public class Mice extends Rodentia{

    }

    Mice mickey;

    @Before
    public void before(){
        mickey = new Mice();
    }

    @Test
    public void isRodent(){
        assertEquals("RODENTIA", mickey.getMyOrder().toString());
    }
    @Test
    public void canJump(){
        assertEquals(true, mickey.getMyMotion().contains(Animalable.Motion.JUMP));
    }
    @Test
    public void canRodentiaMove(){
        ArrayList<Animalable.Motion> rodentiaMoves =  new ArrayList<>();
        Animalable.Motion[] expectedMoves = {
                Animalable.Motion.JUMP,
                Animalable.Motion.RUN,
                Animalable.Motion.WALK,
                Animalable.Motion.SWIM,
                Animalable.Motion.CRAWL
        };
        rodentiaMoves.addAll(Arrays.asList(expectedMoves));
        for (Animalable.Motion move: rodentiaMoves){
            assertEquals(true, mickey.getMyMotion().contains(move));
        }
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", mickey.getMyClass().name());
    }

}