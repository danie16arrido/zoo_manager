package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class BirdTest {
    public class Seagul extends Bird {

    }
    Seagul pablo;

    @Before
    public void before(){
        pablo = new Seagul();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", pablo.getMyClass().name());
    }

    @Test
    public void isSubClassBird(){
        assertEquals("BIRD", pablo.getMySubClass().name());
    }

}