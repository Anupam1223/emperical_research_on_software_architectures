package com.fyp.homrent.shareddomain;

public enum RentingStatus {
    RENTED, HALF_BOOKED, NOT_BOOKED;

    public boolean sameValueAs(RentingStatus other) {
        return this.equals(other);
    }
}
