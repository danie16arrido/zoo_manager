package com.codeclan.code.example.zoomanager.AnimalBuilder.EatingHabits;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.VertebrateFactory;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 31/05/2017.
 */
public class EatingHabitsTest {
    VertebrateFactory factory;
    Animalable animal;

    @Before
    public void before(){
        factory = new VertebrateFactory();
        animal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
    }
    @Test
    public void canSetAnimalFeedingBehaviour(){
        animal.setMyFeedingBehaviour(new Carnivore().type());
    }


}