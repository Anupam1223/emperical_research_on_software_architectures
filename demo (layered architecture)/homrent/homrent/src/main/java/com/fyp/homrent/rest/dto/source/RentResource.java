package com.fyp.homrent.rest.dto.source;

public class RentResource {
    public String rentId;
    public String firstname;
    public String lastname;
    public int age;
    public boolean maritalStatus;
    public String profession;
    public String flatId;

    public RentResource() {

    }

    public RentResource(String rentId, String firstname, String lastname, int age, boolean maritalStatus,
            String profession, String flatId) {

        this.rentId = rentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
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
