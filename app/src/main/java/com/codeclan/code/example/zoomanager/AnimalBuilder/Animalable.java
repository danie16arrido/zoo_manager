package com.codeclan.code.example.zoomanager.AnimalBuilder;

import android.content.Context;

import com.codeclan.code.example.zoomanager.AnimalBuilder.Food.Edible;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by user on 27/05/2017.
 */

public interface Animalable {
    public enum AnimalClass {
        VERTEBRATE,
        INVERTEBRATE
    }

    public enum AnimalSubClass{
        REPTILE,
        FISH,
        AMPHIBIAN,
        BIRD,
        MAMMAL
    }

    public interface AnimalOrders {
        enum MammalOrders implements AnimalOrders {
            RODENTIA,
            CHIROPTERA,
            INSECTIVORA,
            MARSUPIALIA,
            CARNIVORA,
            PRIMATES,
            ARTIODACTYLA,
            CETACEA,
            LAGOMORPHA,
            PINNIPEDIA,
            EDENTATA,
            PERRISSODACTYLA,
            PROBOSCIDEA
        }
        enum BirdOrders implements AnimalOrders {
            STRUTHIONIFORMES,
            CRACIFORMES,
            GALLIFORMES,
            ANSERIFORMES,
            TURNICIFORMES,
            PICIFORMES,
            GALBULIFORMES,
            BUCEROTIFORMES,
            UPUPIFORMES,
            TROGONIFORMES,
            CORACIIFORMES,
            COLIIFORMES,
            CUCULIFORMES,
            PSITTACIFORMES,
            APODIFORMES,
            TROCHILIFORMES,
            MUSOPHAGIFORMES,
            STRIGIFORMES,
            COLUMBIFORMES,
            GRUIFORMES,
            CICONIIFORMES
        }

        enum ReptilOrders implements AnimalOrders{
            RHYNCOCEPHALIA,
            SQUAMATA,
            CHELONIA,
            CROCODILIA
        }

        enum FishOrders implements AnimalOrders {
            PREHISTORIC,
            BONY,
            CARTILAGINOUS,
            JAWLESS
        }

        enum AmphibianOrders implements  AnimalOrders {
            ANURA,
            URODELA,
            APODA
        }
    }

    public enum Motion{
        SWIM,
        CRAWL,
        CLIMB,
        RUN,
        WALK,
        JUMP,
        FLY,
        DIG
    }

    public enum FeedingBehaviour {
        AUTOTROPH,
        CARNIVORE,
        ERGIVORE,
        HERBIVORE,
        OMNIVORE,
        SCAVENGER,
        INSECTIVORE
    }

    public enum Media {
        AIR,
        EARTH,
        WATER
    }

    public enum Sex {
        MALE,
        FEMALE,
        HERMAPHRODITE
    }

    public AnimalClass getMyClass();
    public void setMyClass(AnimalClass animalClass);

    public AnimalSubClass getMySubClass();
    public void setMySubClass(AnimalSubClass animalSubClass);

    public AnimalOrders getMyOrder();
    public void setMyOrder(AnimalOrders myOrder);

    public FeedingBehaviour getMyFeedingBehaviour();
    public void setMyFeedingBehaviour(FeedingBehaviour myConsumption);

    public ArrayList<Media> getMyMedia();
    public void addMedia(Media aMedia);

    public ArrayList<Motion> getMyMotion();
    public void addMotion(Motion aMotion);

    public String getName();
    public void setName(String name);

    public String getCommonName();
    public void setCommonName(String commonName);

    public String getScientificName();
    public void setScientificName(String scientificName);

    public Boolean amIHazardous();
    public void setHazardous(boolean hazardous);

    public Sex getMySex();
    public void setMySex(Sex aSex);

    public Timestamp getLastTimeFed();
    public void feedMe(Timestamp aTime, Edible food);

    public int getFeedingPeriod();
    public void setFeedingPeriod(int every);

    public boolean timeToFeed();

    public int howFullIsMyBelly();

}
