package com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalSubClass;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animal;
import com.codeclan.code.example.zoomanager.AnimalBuilder.AnimalClass.Vertebrate;

/**
 * Created by user on 28/05/2017.
 */

public abstract class Amphibian extends Vertebrate {
    public Amphibian(){
        setMySubClass(AnimalSubClass.AMPHIBIAN);
    }
}
