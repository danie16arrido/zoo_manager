package com.codeclan.code.example.zoomanager.Fee;

/**
 * Created by user on 30/05/2017.
 */

public class MagicExperience extends FeeableDecorator {
    double magicExperiencePrice = 10;
    String description = "A chance to get up close and personal with some of your favourite animals at Zoo";

    public MagicExperience(BaseFee baseFee) {
        super(baseFee);
    }

    @Override
    public double getFee() {
        return this.standardFee.getFee() + this.magicExperiencePrice;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
