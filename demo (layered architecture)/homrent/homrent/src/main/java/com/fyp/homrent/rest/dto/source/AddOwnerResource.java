package com.fyp.homrent.rest.dto.source;

public class AddOwnerResource {

    private String ownerName;
    private String location;
    private int booking_amount;
    private int monthly_rent;
    private String type;

    public int getBooking_amount() {
        return booking_amount;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthly_rent() {
        return monthly_rent;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getType() {
        return type;
    }
}
