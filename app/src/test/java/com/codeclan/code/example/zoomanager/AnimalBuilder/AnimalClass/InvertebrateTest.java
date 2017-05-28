package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class InvertebrateTest {
    public class Fly extends Invertebrate {

    }
    Fly pepe;

    @Before
    public void before(){
        pepe = new Fly();
    }

    @Test
    public void isInvertebrate(){
        assertEquals("INVERTEBRATE", pepe.getMyClass().name());
    }

}