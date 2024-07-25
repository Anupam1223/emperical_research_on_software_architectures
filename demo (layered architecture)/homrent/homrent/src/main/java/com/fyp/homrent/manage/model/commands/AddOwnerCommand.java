package com.fyp.homrent.manage.model.commands;

public class AddOwnerCommand {

    private String ownerName;
    private String location;
    private int booking_amount;
    private int monthly_rent;
    private String ownerId;
    private String type;

    public AddOwnerCommand(String ownerName, String location, int booking_amount, int monthly_rent, String type) {
        this.ownerName = ownerName;
        this.location = location;
        this.booking_amount = booking_amount;
        this.monthly_rent = monthly_rent;
        this.type = type;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public int getBooking_amount() {
        return booking_amount;
    }

    public String getType() {
        return type;
    }

    public int getMonthly_rent() {
        return monthly_rent;
    }

}