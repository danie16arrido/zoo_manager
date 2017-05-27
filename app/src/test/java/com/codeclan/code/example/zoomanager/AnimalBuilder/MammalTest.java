package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class MammalTest {
    Mammal lion;
    @Before
    public void before(){
        lion = new Mammal();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", lion.getMyClass().name());
    }
}