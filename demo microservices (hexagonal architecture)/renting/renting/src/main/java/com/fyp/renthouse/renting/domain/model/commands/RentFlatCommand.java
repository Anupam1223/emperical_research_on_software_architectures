package com.fyp.renthouse.renting.domain.model.commands;

public class RentFlatCommand {

    public String rentId;
    public String firstname;
    public String lastname;
    public int age;
    public boolean maritalStatus;
    public String profession;
    public String flatID;
    public Float bookingAmount;

    public RentFlatCommand() {
    }

    public RentFlatCommand(String firstname, String lastname, int age,
            boolean maritalStatus, String profession, String flatId, Float bookingAmount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
        this.flatID = flatId;
        this.bookingAmount = bookingAmount;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getProfession() {
        return this.profession;
    }

    public boolean getMaritalStatus() {
        return this.maritalStatus;
    }

    public String getFlatID() {
        return flatID;
    }

    public void setFlatID(String flatID) {
        this.flatID = flatID;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setBookingAmount(Float bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Float getBookingAmount() {
        return bookingAmount;
    }
}
