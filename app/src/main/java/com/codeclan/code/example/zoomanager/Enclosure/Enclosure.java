package com.codeclan.code.example.zoomanager.Enclosure;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import java.util.ArrayList;

/**
 * Created by user on 29/05/2017.
 */

public abstract class Enclosure implements Enclosuring {
    private int maxCapacity;
    private ArrayList<Animalable> hosts;


    public Enclosure(){
        hosts = new ArrayList<>();
        maxCapacity = 1;
    }

    @Override
    public boolean addAnimalToEnclosure(Animalable animal) {
        if (getRemainingOccupancy() > 0){
            this.hosts.add(animal);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void removeAnimalFromEnclosure(Animalable animal) {
        this.hosts.remove(animal);
    }

    @Override
    public boolean checkIfEmpty() {
        return (hosts.size() == 0);
    }

    @Override
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    @Override
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int getCurrentOccupancy() {
        return hosts.size();
    }

    @Override
    public int getRemainingOccupancy() {
        return (maxCapacity - getCurrentOccupancy());
    }

    @Override

    public ArrayList<Animalable> getHosts(){
        return this.hosts;
    }


    public Animalable findAnimalByName(String animalName){
        for ( Animalable toBeFound : this.hosts){
            if (toBeFound.getName().equals(animalName)){
                return toBeFound;
            }
        }
        return null;
    }
}
