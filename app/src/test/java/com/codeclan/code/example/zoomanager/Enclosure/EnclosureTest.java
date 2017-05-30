package com.codeclan.code.example.zoomanager.Enclosure;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.VertebrateFactory;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class EnclosureTest {
    public class anEnclosure extends Enclosure{

    }
    anEnclosure cage;
    VertebrateFactory factory = new VertebrateFactory();

    @Before
    public void before(){
        cage =  new anEnclosure();
    }

    @Test
    public void canSetMaxCapacity(){
        cage.setMaxCapacity(100);
        assertEquals(100, cage.getMaxCapacity());
    }

    @Test
    public void canAddAnimalable(){
        Animalable mammal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        cage.addAnimalToEnclosure(mammal);
        assertEquals(1, cage.getCurrentOccupancy());
    }

    @Test
    public void canRemoveAnimalable(){
        Animalable mammal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        cage.addAnimalToEnclosure(mammal);
        ArrayList<Animalable> temp = cage.getHosts();
        cage.removeAnimalFromEnclosure(temp.get(0));
        assertEquals(0, cage.getCurrentOccupancy());
    }

    @Test
    public void checkIfEmpty(){
        assertEquals(true, cage.checkIfEmpty());
    }

    @Test
    public void canGetRemainingOcuppancy(){
        cage.setMaxCapacity(2);
        Animalable mammal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        cage.addAnimalToEnclosure(mammal);
        assertEquals(1, cage.getRemainingOccupancy());
    }

    @Test
    public void checkIfNotEmpty(){
        Animalable mammal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        cage.addAnimalToEnclosure(mammal);
        assertEquals(false, cage.checkIfEmpty());
    }

   @Test
    public void canGetNameFromAnimalableInCage(){
       Animalable mammal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
       mammal.setName("Boby");
       cage.addAnimalToEnclosure(mammal);
       assertEquals("Boby", mammal.getName());
    }

    @Test
    public void canNotAddAnimalWhenMaxCapacity(){
        Animalable mammal = factory.createAnimal(Animalable.AnimalSubClass.MAMMAL);
        mammal.setName("Boby");
        Animalable fish = factory.createAnimal(Animalable.AnimalSubClass.FISH);
        mammal.setName("Adam");
        cage.setMaxCapacity(1);
        cage.addAnimalToEnclosure(mammal);
        assertEquals(1, cage.getCurrentOccupancy());
        assertEquals(0, cage.getRemainingOccupancy());
        assertEquals(false, cage.addAnimalToEnclosure(fish));
    }

}