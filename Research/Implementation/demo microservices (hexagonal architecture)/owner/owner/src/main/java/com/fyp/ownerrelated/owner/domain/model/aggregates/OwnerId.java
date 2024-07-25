package com.fyp.ownerrelated.owner.domain.model.aggregates;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Embeddable;

@Embeddable
public class OwnerId implements Serializable {
    @Column(name = "owner_id")
    private String ownerId;

    public OwnerId() {
    }

    public OwnerId(String rentId) {
        this.ownerId = rentId;
    }

    public String getOwnerId() {
        return this.ownerId;
    }
}
