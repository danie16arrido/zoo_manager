package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class VertebrateTest {
    public class dog extends Vertebrate {

    }
    dog boby;

    @Before
    public void before(){
        boby =  new dog();
    }

    @Test
    public void isVertebrate(){
        assertEquals("VERTEBRATE", boby.getMyClass().name());
    }
}