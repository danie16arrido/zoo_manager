package com.codeclan.code.example.zoomanager.Fee;

/**
 * Created by user on 30/05/2017.
 */

public class ZooKeeperExperience extends FeeableDecorator {
    private double zooKeeperExperincePrice = 23;
    private String description = "Spend the day being a keeper at the Zoo";

    public ZooKeeperExperience(BaseFee baseFee) {
        super(baseFee);
    }

    @Override
    public double getFee() {
        return this.standardFee.getFee() + zooKeeperExperincePrice;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
