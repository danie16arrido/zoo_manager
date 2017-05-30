package com.codeclan.code.example.zoomanager.Fee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 30/05/2017.
 */
public class CuddleATigerExperienceTest {
    BaseFee base;
    CuddleATigerExperience cuddle;

    @Before
    public void before(){
        base = new BaseFee();
        cuddle = new CuddleATigerExperience(base);
    }

    @Test
    public void canGetCuddlePrice(){
        assertEquals(24, cuddle.getFee(), 0.01);
    }

}