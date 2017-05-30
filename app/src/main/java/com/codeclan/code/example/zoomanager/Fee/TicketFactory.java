package com.codeclan.code.example.zoomanager.Fee;

/**
 * Created by user on 30/05/2017.
 */

public class TicketFactory {

    public static Feeable createTicket(TicketTypes.source ticket){
        BaseFee standardTicket = new BaseFee();
        switch (ticket){
            case STANDARD:
                return standardTicket;
            case CUDDLE_A_TIGER:
                return new CuddleATigerExperience(standardTicket);
            case ZOO_KEEPER_EXPERIENCE:
                return new ZooKeeperExperience(standardTicket);
            default:
                return null;
        }
    }
}
