package com.codeclan.code.example.zoomanager.AnimalBuilder;

/**
 * Created by user on 27/05/2017.
 */

public class Animal implements Animalable {
    private AnimalClass myClass;
    private AnimalSubClass mySubClass;

    public Animal(AnimalClass aClass, AnimalSubClass aSubClass){
        this.myClass = aClass;
        this.mySubClass = aSubClass;
    }

    public AnimalClass getMyClass(){
        return this.myClass;
    }

    public void setMyClass(AnimalClass myClass) {
        this.myClass = myClass;
    }

    public AnimalSubClass getMySubClass(){
        return this.mySubClass;
    }

    public void setSubClass(AnimalSubClass aSubClass){
        this.mySubClass = aSubClass;
    }
}
