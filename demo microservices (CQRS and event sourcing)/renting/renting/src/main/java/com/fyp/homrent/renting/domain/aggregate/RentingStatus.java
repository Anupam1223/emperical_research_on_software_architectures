package com.fyp.homrent.renting.domain.aggregate;

public enum RentingStatus {
    RENTED, HALF_BOOKED, NOT_BOOKED;

    public boolean sameValueAs(RentingStatus other) {
        return this.equals(other);
    }
}
