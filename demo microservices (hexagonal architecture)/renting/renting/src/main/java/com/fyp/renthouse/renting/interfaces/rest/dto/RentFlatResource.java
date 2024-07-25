package com.fyp.renthouse.renting.interfaces.rest.dto;

public class RentFlatResource {

    public String firstname;
    public String lastname;
    public int age;
    public boolean maritalStatus;
    public String profession;
    public String flatID;
    public Float bookingAmount;

    public RentFlatResource() {
    }

    public RentFlatResource(String firstname, String lastname, int age,
            boolean maritalStatus, String profession, String flatId, Float bookingAmount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
        this.flatID = flatId;
        this.bookingAmount = bookingAmount;
    }
}
