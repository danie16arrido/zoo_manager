package com.codeclan.code.example.zoomanager.ZooKeeper;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Food;
import com.codeclan.code.example.zoomanager.Enclosure.Enclosure;
import com.codeclan.code.example.zoomanager.Fee.Feeable;
import com.codeclan.code.example.zoomanager.Fee.TicketTypes;
import com.codeclan.code.example.zoomanager.Person.Person;

import java.sql.Timestamp;
import java.util.ArrayList;

import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.CARNIVORE;
import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.HERBIVORE;
import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.INSECTIVORE;
import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.SCAVENGER;

/**
 * Created by user on 29/05/2017.
 */

public class ZooKeeper {
    private String name;
    private ArrayList<Enclosure> allEnclosures;
    private ArrayList<Person> currentVisitors;

//    private double entryFee = 17;
    private double discountFeeChildren = 20;
    private double discountFeeSenior = 30;

    private double coffers;

    private int maxCapacity;


    public ZooKeeper(String name){
        this.name = name;
        this.allEnclosures = new ArrayList<>();
        this.currentVisitors = new ArrayList<>();
        this.coffers = 0;
        this.setMaxCapacity(20);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEnclosures() {
        return allEnclosures.size();
    }

    public void addEnclosure(Enclosure anEnclousure) {
        this.allEnclosures.add(anEnclousure);
    }

    public ArrayList<Enclosure> getEnclosures() {
        return this.allEnclosures;
    }

    public void removeEnclosure(Enclosure anEnclosure) {
        this.allEnclosures.remove(anEnclosure);
    }

    public  void feedAnimalsInCage(Enclosure anEnclosure) {
        Timestamp now = new Timestamp(System.currentTimeMillis());

        for (Animalable animal : anEnclosure.getHosts()){
            Food food = new Food("food");
            if (animal.timeToFeed()){
                switch (animal.getMyFeedingBehaviour()) {
                    case INSECTIVORE:
                        food.setType(INSECTIVORE);
                        food.setName("fly");
                    case CARNIVORE:
                        food.setType(CARNIVORE);
                        food.setName("beef");
                    case HERBIVORE:
                        food.setType(HERBIVORE);
                        food.setName("plants");
                    case SCAVENGER:
                        food.setType(SCAVENGER);
                        food.setName("chicken");
                    default:
                        break;
                }
                animal.feedMe(now, food);
            }
        }
    }


    public boolean transferBaby(Enclosure originEnclosure, Animalable animalMoving, ZooKeeper destination, Enclosure destEnclousure) {
        if (!animalMoving.isAdult()){
            originEnclosure.removeAnimalFromEnclosure(animalMoving);
            destination.addEnclosure(destEnclousure);
            destEnclousure.addAnimalToEnclosure(animalMoving);
            return true;
        }else {
            return false;
        }
    }

    public boolean sellTicket(Person visitor, Feeable ticket) {
        if (maxCapacity > getNumberOfVisitors()){
            this.currentVisitors.add(visitor);
            double feeToCharge = getFee(visitor.getAge(), ticket.getFee());
            visitor.takeFromWallet(feeToCharge);
            this.coffers += feeToCharge;
            return true;
        }else{
            return false;
        }
    }

    private double getFee(int age, double fee){
        if (age >= 60){
            return applyDiscount(fee, discountFeeSenior);
        }else if (age <=12){
            return applyDiscount(fee, discountFeeChildren);
        }
        else{
            return fee;
        }
    }

    private double applyDiscount(double fee, double percentageDiscount){
        return fee * ((100 - percentageDiscount)/100);
    }

    public int getNumberOfVisitors() {
        return this.currentVisitors.size();
    }

    public double getCoffers() {
        return this.coffers;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
