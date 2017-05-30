package com.codeclan.code.example.zoomanager.Enclosure;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import java.util.ArrayList;

/**
 * Created by user on 29/05/2017.
 */

public interface Enclosuring {
    public boolean addAnimalToEnclosure(Animalable animal);
    public void removeAnimalFromEnclosure(Animalable animal);

    public boolean checkIfEmpty();
    public int getMaxCapacity();
    public void setMaxCapacity(int maxCapacity);

    public int getCurrentOccupancy();
    public int getRemainingOccupancy();

    public ArrayList<Animalable> getHosts();

}
