package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass.Vertebrate;

/**
 * Created by user on 28/05/2017.
 */

public abstract class Reptile extends Vertebrate {
    public Reptile(){
        setMySubClass(AnimalSubClass.REPTILE);
    }
}
