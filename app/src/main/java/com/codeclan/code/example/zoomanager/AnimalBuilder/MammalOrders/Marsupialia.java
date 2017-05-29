package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;

/**
 * Created by user on 29/05/2017.
 */

public abstract class Marsupialia extends Mammal {
    public Marsupialia(){
        addMotion(Motion.JUMP);

        addMedia(Media.EARTH);

        setHazardous(true);

        setMyOrder(AnimalOrders.MammalOrders.MARSUPIALIA);
    }
}

