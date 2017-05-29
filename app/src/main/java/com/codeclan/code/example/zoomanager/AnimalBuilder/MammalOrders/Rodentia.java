package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Crawling;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Jumping;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Running;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Swimming;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Walking;

import java.util.ArrayList;

/**
 * Created by user on 28/05/2017.
 */

public abstract class Rodentia extends Mammal {
    public Rodentia() {
        super();
        addMotion(Motion.SWIM);
        addMotion(Motion.RUN);
        addMotion(Motion.WALK);
        addMotion(Motion.CRAWL);
        addMotion(Motion.JUMP);

        addMedia(Media.EARTH);

        setMyOrder(AnimalOrders.MammalOrders.RODENTIA);
    }

}
