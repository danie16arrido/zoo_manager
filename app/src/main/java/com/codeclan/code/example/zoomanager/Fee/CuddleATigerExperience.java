package com.codeclan.code.example.zoomanager.Fee;

/**
 * Created by user on 30/05/2017.
 */

public class CuddleATigerExperience extends FeeableDecorator {
    private double cuddleATigerPrice = 7;
    private String description ="Zoo entry plus cuddle a tiger experience";

    public CuddleATigerExperience(BaseFee baseFee) {
        super(baseFee);
    }

    @Override
    public double getFee() {
        return this.standardFee.getFee() + this.cuddleATigerPrice;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
