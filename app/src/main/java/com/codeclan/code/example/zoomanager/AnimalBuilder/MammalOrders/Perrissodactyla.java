package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;

/**
 * Created by user on 29/05/2017.
 */

public abstract class Perrissodactyla extends Mammal {
    public Perrissodactyla(){
        addMotion(Motion.RUN);
        addMotion(Motion.JUMP);
        addMotion(Motion.SWIM);
        addMotion(Motion.WALK);

        addMedia(Media.EARTH);
        addMedia(Media.WATER);

        setHazardous(true);
        setMyFeedingBehaviour(FeedingBehaviour.CARNIVORE);
        setMyOrder(AnimalOrders.MammalOrders.PERRISSODACTYLA);
    }
}
