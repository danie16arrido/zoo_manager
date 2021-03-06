package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;


/**
 * Created by user on 29/05/2017.
 */

public abstract class Primates extends Mammal {
    public Primates(){
        addMotion(Motion.RUN);
        addMotion(Motion.JUMP);
        addMotion(Motion.SWIM);
        addMotion(Motion.WALK);

        addMedia(Media.EARTH);
        addMedia(Media.WATER);

        setHazardous(true);

        setMyOrder(AnimalOrders.MammalOrders.PRIMATES);
    }
}
