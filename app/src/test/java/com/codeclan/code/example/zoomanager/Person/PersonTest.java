package com.codeclan.code.example.zoomanager.Person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 30/05/2017.
 */
public class PersonTest {
    private static final double DELTA = 1e-15;
    Person daniel;
    @Before
    public void before(){
        daniel = new Person("Daniel", 40);
    }

    @Test
    public void canGetSetName(){
        daniel.setName("Juan");
        assertEquals("Juan", daniel.getName());
    }

    @Test
    public void canGetSetAge(){
        daniel.setAge(666);
        assertEquals(666, daniel.getAge());
    }

    @Test
    public void canSetGetWallet(){
        daniel.addToWallet(99.99);
        assertEquals(99.99, daniel.getWallet(), DELTA);
    }

    @Test
    public void canGetMoneyFromWallet(){
        daniel.addToWallet(100);
        assertEquals(100, daniel.getWallet(), DELTA);

        daniel.addToWallet(-9.90);
        assertEquals(90.10, daniel.getWallet(), DELTA);
    }

    @Test
    public void canOverload(){
        Person dan = new Person("John", 33, 15.5);
        assertEquals("John", dan.getName());
        assertEquals(33, dan.getAge());
        assertEquals(15.5, dan.getWallet(), DELTA);
    }

}