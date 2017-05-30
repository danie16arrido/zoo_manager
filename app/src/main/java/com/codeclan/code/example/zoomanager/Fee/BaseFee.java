package com.codeclan.code.example.zoomanager.Fee;

/**
 * Created by user on 30/05/2017.
 */

public class BaseFee implements Feeable {
    private double myFee;
    private String description;

    public BaseFee(){
        this.myFee = 17.0;
        this.description = "Zoo Entry Feeable";
    }
    @Override
    public double getFee() {
        return this.myFee;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
