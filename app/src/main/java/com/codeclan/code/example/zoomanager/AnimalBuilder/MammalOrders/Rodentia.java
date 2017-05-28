package com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Crawling;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Jumping;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Running;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Swimming;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Walking;

/**
 * Created by user on 28/05/2017.
 */

public abstract class Rodentia extends Mammal implements Running, Walking, Jumping, Swimming, Crawling {
    public Rodentia(){
        super();
        iJump(Motion.JUMP);
        iSwim(Motion.SWIM);
        iRun(Motion.RUN);
        iWalk(Motion.WALK);
        iCrawl(Motion.CRAWL);
        setMyOrder(AnimalOrders.MammalOrders.RODENTIA);
    }
    @Override
    public void iJump(Motion jump) {
        addMotion(jump);
    }

    @Override
    public void iRun(Motion run) {
        addMotion(run);
    }

    @Override
    public void iWalk(Motion walk) {
        addMotion(walk);
    }

    @Override
    public void iCrawl(Motion crawl) {
        addMotion(crawl);
    }

    @Override
    public void iSwim(Motion swim) {
        addMotion(swim);
    }

}
