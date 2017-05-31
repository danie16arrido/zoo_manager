package com.codeclan.code.example.zoomanager.AnimalBuilder;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Edible;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Created by user on 27/05/2017.
 */

public  class Animal implements Animalable {
    private String name;
    private String scientificName;
    private String commonName;

    private AnimalClass myClass;
    private AnimalSubClass mySubClass;
    private AnimalOrders myOrder;

    private FeedingBehaviour myFeeding;
    private ArrayList<Media> myMedia;
    private ArrayList<Motion> myMotion;

    private Boolean hazardous;
    private Sex mySex;

    private Timestamp lastTimeFed;
    private int feedPeriod;
    private boolean fed;

    private ArrayList<Edible> belly;
    private boolean adult;

    public Animal(){
        this.myMedia = new ArrayList<Media>();
        this.myMotion = new ArrayList<Motion>();
        this.fed = false;
        this.belly = new ArrayList<>();
//        this.lastTimeFed = new Timestamp(System.currentTimeMillis());
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

    public void setMySubClass(AnimalSubClass mySubClass){
        this.mySubClass = mySubClass;
    }

    public FeedingBehaviour getMyFeedingBehaviour(){
        return this.myFeeding;
    }

    public ArrayList<Media> getMyMedia() {
        return this.myMedia;
    }

    public ArrayList<Motion> getMyMotion() {
        return this.myMotion;
    }

    public void setMyFeedingBehaviour(FeedingBehaviour myFeeding) {
        this.myFeeding = myFeeding;
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

    public AnimalOrders getMyOrder(){
        return this.myOrder;
    }
    public void setMyOrder(AnimalOrders myOrder){
        this.myOrder = myOrder;
    }

    public Timestamp getLastTimeFed(){
        return this.lastTimeFed;
    }

    public void feedMe(Timestamp feedingTime, Edible food){
        this.lastTimeFed = feedingTime;
        this.belly.add(food);
    }

    public int getFeedingPeriod(){
        return this.feedPeriod;
    }

    public void setFeedingPeriod(int every) {
        this.feedPeriod = every;
    }

    public boolean timeToFeed(){
        this.fed = checkIfNeedFeeding();
        return this.fed;
    }

    private boolean checkIfNeedFeeding(){
        Timestamp now = new Timestamp(System.currentTimeMillis());
        long diff = compareTwoTimeStamps(now, this.getLastTimeFed());
        return (diff > this.feedPeriod);
    }

    private static long compareTwoTimeStamps(Timestamp currentTime, Timestamp oldTime)
    {
        long milliseconds1 = oldTime.getTime();
        long milliseconds2 = currentTime.getTime();

        long diff = milliseconds2 - milliseconds1;
//        long diffSeconds = diff / 1000;
//        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
//        long diffDays = diff / (24 * 60 * 60 * 1000);

        return diffHours;
    }

    public int howFullIsMyBelly(){
        return this.belly.size();
    }

    @Override
    public boolean isAdult() {
        return this.adult ;
    }

    public void setAsAdult() {
        this.adult = true;
    }

    public void setAsBaby() {
        this.adult = false;
    }

}
