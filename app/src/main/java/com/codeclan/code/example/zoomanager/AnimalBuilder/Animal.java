package com.codeclan.code.example.zoomanager.AnimalBuilder;

import java.util.ArrayList;

/**
 * Created by user on 27/05/2017.
 */

public abstract class Animal implements Animalable {
    private AnimalClass myClass;
    private AnimalSubClass mySubClass;
    private Consumption myConsumption;
    private ArrayList<Media> myMedia;
    private ArrayList<Motion> myMotion;

    private String name;
    private String scientificName;
    private String commonName;
    private Boolean hazardous;
    private Sex mySex;

//    public Animal(AnimalClass aClass, AnimalSubClass aSubClass, Consumption aConsumption){
//        this.myClass = aClass;
//        this.mySubClass = aSubClass;
//        this.myConsumption = aConsumption;
//        this.myMedia = new ArrayList<Media>();
//        this.myMotion = new ArrayList<Motion>();
//    }
//
//    //Overloading Constructor
//    public Animal(){
//        this.myMedia = new ArrayList<Media>();
//        this.myMotion = new ArrayList<Motion>();
//    }

    public AnimalClass getMyClass(){
        return this.myClass;
    }

    public void setMyClass(AnimalClass myClass) {
        this.myClass = myClass;
    }

    public AnimalSubClass getMySubClass(){
        return this.mySubClass;
    }

    public void setSubClass(AnimalSubClass mySubClass){
        this.mySubClass = mySubClass;
    }

    public Consumption getMyConsumption(){
        return this.myConsumption;
    }

    public ArrayList<Media> getMyMedia() {
        return this.myMedia;
    }

    public ArrayList<Motion> getMyMotion() {
        return this.myMotion;
    }

    public void setMyConsumption(Consumption myConsumption) {
        this.myConsumption = myConsumption;
    }

    public void addMedia(Media myMedia) {
        this.myMedia.add(myMedia);
    }

    public void addMotion(Motion myMotion) {
        this.myMotion.add(myMotion);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getScientificName() {
        return this.scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }
    
    public String getCommonName(){
        return this.commonName;
    }
    
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
    
    public Boolean amIHazardous(){
        return this.hazardous;
    }
    public void setHazardous(boolean hazardous) {
        this.hazardous = hazardous;
    }
    
    public Sex getMySex(){
        return this.mySex;
    }
    public void setMySex(Sex mySex) {
        this.mySex = mySex;
    }
}
