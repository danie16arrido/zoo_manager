package com.codeclan.code.example.zoomanager.AnimalBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class FishTest {

    public class Sardine extends Fish{

    }
    Sardine lola;
    @Before
    public void before(){
        lola = new Sardine();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", lola.getMyClass().name());
    }

    @Test
    public void isFish(){
        assertEquals("FISH", lola.getMySubClass().name());
    }


}