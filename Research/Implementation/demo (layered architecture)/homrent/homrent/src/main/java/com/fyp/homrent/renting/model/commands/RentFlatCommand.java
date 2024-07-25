package com.fyp.homrent.renting.model.commands;

public class RentFlatCommand {

    private String rentId;
    public String firstname;
    public String lastname;
    public int age;
    public boolean maritalStatus;
    public String profession;
    public String flatId;

    public RentFlatCommand() {

    }

    public RentFlatCommand(String rentId, String firstname, String lastname, int age, boolean maritalStatus,
            String profession, String flatId) {

        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.rentId = rentId;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
        this.flatId = flatId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setFlatId(String flatId) {
        this.flatId = flatId;
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

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFlatId() {
        return flatId;
    }

    public String getLastname() {
        return lastname;
    }

    public String getProfession() {
        return profession;
    }

    public String getRentId() {
        return rentId;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

}
