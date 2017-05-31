package com.codeclan.code.example.zoomanager.AnimalBuilder.EatingHabits;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

/**
 * Created by user on 31/05/2017.
 */

public interface EatingHabits {
    public Animalable.FeedingBehaviour type();
}

class Carnivore implements EatingHabits{

    @Override
    public Animalable.FeedingBehaviour type() {
        return Animalable.FeedingBehaviour.CARNIVORE;
    }
}

class Hervibore implements EatingHabits {

    @Override
    public Animalable.FeedingBehaviour type() {
        return Animalable.FeedingBehaviour.HERBIVORE;
    }
}

class Insectivore implements EatingHabits {

    @Override
    public Animalable.FeedingBehaviour type() {
        return Animalable.FeedingBehaviour.INSECTIVORE;
    }
}
