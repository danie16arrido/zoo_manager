package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass.Vertebrate;

/**
 * Created by user on 27/05/2017.
 */

public abstract class Mammal extends Vertebrate {

    public Mammal(){
        super();
        setMySubClass(AnimalSubClass.MAMMAL);
    }
}
