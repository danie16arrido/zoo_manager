package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class AmphibianTest {
    public class Frog extends Amphibian {

    }
    Frog pepito;

    @Before
    public void before(){
        pepito = new Frog();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", pepito.getMyClass().name());
    }

    @Test
    public void isAmphibian(){
        assertEquals("AMPHIBIAN", pepito.getMySubClass().name());
    }

}