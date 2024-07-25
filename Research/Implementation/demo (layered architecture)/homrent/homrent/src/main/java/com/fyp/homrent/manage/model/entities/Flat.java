package com.fyp.homrent.manage.model.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Flat {

    @Column(name = "location")
    public String location;
    @Column(name = "booking_amount")
    public int bookingAmount;
    @Column(name = "monthly_rent")
    public int monthlyRent;
    @Column(name = "type")
    public String type;

    public Flat() {
    }

    public Flat(String location, int bookingAmount, int monthlyRent, String type) {
        this.location = location;
        this.bookingAmount = bookingAmount;
        this.monthlyRent = monthlyRent;
        this.type = type;
    }

    public int getBookingAmount() {
        return bookingAmount;
    }

    public String getLocation() {
        return location;
    }

    public Integer getMonthlyRent() {
        return monthlyRent;
    }

    public String getType() {
        return type;
    }

    public void setBookingAmount(int bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMonthlyRent(Integer monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setType(String type) {
        this.type = type;
    }

}