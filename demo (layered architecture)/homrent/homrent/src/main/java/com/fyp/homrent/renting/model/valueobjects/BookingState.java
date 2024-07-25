package com.fyp.homrent.renting.model.valueobjects;

import javax.persistence.Embeddable;

@Embeddable
public class BookingState {
    public String amountPaid;
    public boolean isComplete;

    public BookingState() {

    }

    public BookingState(String amountPaid, boolean isComplete) {

        this.amountPaid = amountPaid;
        this.isComplete = isComplete;
    }

    public String getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}
