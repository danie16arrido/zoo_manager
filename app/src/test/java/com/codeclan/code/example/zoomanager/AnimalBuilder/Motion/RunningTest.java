package com.codeclan.code.example.zoomanager.AnimalBuilder.Motion;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Jumping;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Mammal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Running;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class RunningTest {
    public class Leopard extends Mammal implements Running, Jumping {

        public Leopard(){
            iJump(Motion.JUMP);
            iRun(Motion.RUN);
        }

        @Override
        public void iJump(Motion jump) {
            addMotion(jump);
        }

        @Override
        public void iRun(Motion run) {
            addMotion(run);
        }
    }
    Leopard cachirulo;

    @Before
    public void before(){
        cachirulo = new Leopard();
    }

    @Test
    public void canJumpAndRun(){
        ArrayList<Animalable.Motion> myMoves = cachirulo.getMyMotion();
        assertEquals(true, myMoves.contains(Animalable.Motion.JUMP));
        assertEquals(true, myMoves.contains(Animalable.Motion.RUN));
    }

}