package com.codeclan.code.example.zoomanager.AnimalBuilder.Motion;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass.Fish;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Motion.Jumping;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class JumpingTest {
    public class Mullet extends Fish implements Jumping {
        public Mullet(){
            iJump(Motion.JUMP);
        }
        @Override
        public void iJump(Motion jump) {
            addMotion(jump);
        }
    }
    Mullet lola;
    @Before
    public void before(){
        lola = new Mullet();
    }

    @Test
    public void canJump(){
        ArrayList<Animalable.Motion> myMoves = lola.getMyMotion();
        assertEquals(true, myMoves.contains(Animalable.Motion.JUMP));
    }


}