package com.fyp.renthouse.renting.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Tenant {

    @Column(name = "firstname")
    public String firstname;
    @Column(name = "lastname")
    public String lastname;
    @Column(name = "age")
    public Integer age;
    @Column(name = "marital_status")
    public boolean maritalStatus;
    @Column(name = "profession")
    public String profession;

    public Tenant() {

    }

    public Tenant(String firstname, String lastname, Integer age, boolean maritalStatus, String profession) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public Integer getAge() {
        return this.age;
    }

    public Boolean getMaritalStatus() {
        return this.maritalStatus;
    }

    public String getProfession() {
        return this.profession;
    }
}
