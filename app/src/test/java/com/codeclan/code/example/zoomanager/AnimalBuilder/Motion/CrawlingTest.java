package com.codeclan.code.example.zoomanager.AnimalBuilder.Motion;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass.Vertebrate;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class CrawlingTest {
    public abstract class Bear extends Vertebrate {}

    public class ClimbingBear extends Bear implements Climbing, Swimming, Crawling{
        public ClimbingBear(){
            iClimb(Motion.CLIMB);
            iSwim(Motion.SWIM);
            iCrawl(Motion.CRAWL);
        }

        @Override
        public void iClimb(Motion climb) {
            addMotion(climb);
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
    ClimbingBear balu;

    @Before
    public void before(){
        balu = new ClimbingBear();
    }
    @Test
    public void iCrawl() throws Exception {
        assertEquals(true, balu.getMyMotion().contains(Animalable.Motion.CRAWL));

    }

}