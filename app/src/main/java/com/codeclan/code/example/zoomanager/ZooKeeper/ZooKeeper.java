package com.codeclan.code.example.zoomanager.ZooKeeper;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Edible;
import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Food;
import com.codeclan.code.example.zoomanager.Enclosure.Enclosure;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;

import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.CARNIVORE;
import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.HERBIVORE;
import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.INSECTIVORE;
import static com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable.FeedingBehaviour.SCAVENGER;

/**
 * Created by user on 29/05/2017.
 */

public class ZooKeeper {
    String name;
    ArrayList<Enclosure> allEnclosures;


    public ZooKeeper(String name){
        this.name = name;
        this.allEnclosures = new ArrayList<>();
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
}
