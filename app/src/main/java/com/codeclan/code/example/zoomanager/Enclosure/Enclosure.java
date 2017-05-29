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
        maxCapacity = 0;
    }

    @Override
    public void addAnimalToEnclosure(Animalable animal) {
        this.hosts.add(animal);
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
}
