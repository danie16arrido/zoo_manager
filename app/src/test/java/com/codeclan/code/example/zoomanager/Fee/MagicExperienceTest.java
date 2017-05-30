package com.codeclan.code.example.zoomanager.Fee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 30/05/2017.
 */
public class MagicExperienceTest {
    BaseFee baseFee;
    MagicExperience magicExperience;

    @Before
    public void before(){
        baseFee = new BaseFee();
        magicExperience = new MagicExperience(baseFee);
    }

    @Test
    public void canGetPrice(){
        assertEquals(27, magicExperience.getFee(), 0.01);
    }

}