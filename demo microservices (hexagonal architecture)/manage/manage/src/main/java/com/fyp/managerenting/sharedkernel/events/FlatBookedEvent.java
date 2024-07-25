package com.fyp.managerenting.sharedkernel.events;

public class FlatBookedEvent {

    private int OwnerId;
    private int bookingAmount;

    FlatBookedEvent() {
    }

    public FlatBookedEvent(int OwnerId, int bookingAmount) {
        this.OwnerId = OwnerId;
        this.bookingAmount = bookingAmount;
    }

    public void setOwnerId(int OwnerId) {
        this.OwnerId = OwnerId;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setBookingAmount(int bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public int getBookingAmount() {
        return bookingAmount;
    }
}
