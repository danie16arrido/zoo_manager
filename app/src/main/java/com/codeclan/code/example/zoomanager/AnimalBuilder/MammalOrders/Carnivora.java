package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.EatingHabits.EatingHabits;

/**
 * Created by user on 29/05/2017.
 */

public abstract class Carnivora extends Mammal {
    public Carnivora(){
        addMotion(Motion.RUN);
        addMotion(Motion.JUMP);
        addMotion(Motion.SWIM);
        addMotion(Motion.WALK);

        addMedia(Media.EARTH);
        addMedia(Media.WATER);

        setHazardous(true);
        setMyFeedingBehaviour(FeedingBehaviour.AUTOTROPH);
        setMyOrder(AnimalOrders.MammalOrders.CARNIVORA);
    }
}
