package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class ReptileTest {
    public class Iguana extends Reptile {

    }
    Iguana juana;

    @Before
    public void before(){
        juana = new Iguana();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", juana.getMyClass().name());
    }

    @Test
    public void isReptile(){
        assertEquals("REPTILE", juana.getMySubClass().name());
    }
}