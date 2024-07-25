package com.fyp.homrent.renting.model.aggregate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RentId implements Serializable {

    @Column(name = "rent_id")
    private String rentId;

    public RentId() {
    }

    public RentId(String rentId) {
        this.rentId = rentId;
    }

    public String getRentId() {
        return this.rentId;
    }
}
