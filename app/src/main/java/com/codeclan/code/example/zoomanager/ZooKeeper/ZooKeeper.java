package com.codeclan.code.example.zoomanager.ZooKeeper;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Animalable;
import com.codeclan.code.example.zoomanager.Enclosure.Enclosure;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;

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

    public static void feedAnimalInCage(Enclosure anEnclosure) {
        for (Animalable animal : anEnclosure.getHosts()){
            if (animal.timeToFeed()){
                Timestamp now = new Timestamp(System.currentTimeMillis());
                animal.feedMe(now);
            }
        }
    }
}
