package com.codeclan.code.example.zoomanager.Fee;

/**
 * Created by user on 30/05/2017.
 */

public abstract class FeeableDecorator implements Feeable {
    BaseFee standardFee;

    public FeeableDecorator(BaseFee baseFee){
        this.standardFee = baseFee;
    }

}
