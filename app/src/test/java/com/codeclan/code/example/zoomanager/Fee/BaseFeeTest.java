package com.codeclan.code.example.zoomanager.Fee;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 30/05/2017.
 */
public class BaseFeeTest {

    @Test
    public void canGetFeed(){
        Feeable base = new BaseFee();
        assertEquals(17, base.getFee(), 0.001);
    }

    @Test
    public void canGetDescription(){
        Feeable base = new BaseFee();
        assertEquals("Zoo Entry Feeable", base.getDescription());
    }



}