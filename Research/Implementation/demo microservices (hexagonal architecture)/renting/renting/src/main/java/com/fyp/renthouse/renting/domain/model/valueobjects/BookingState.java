package com.fyp.renthouse.renting.domain.model.valueobjects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookingState {
    @Column(name = "amountpaid")
    public Float amountPaid;
    // @Column(name = "isTotalAmountPaid")
    // public boolean isComplete = false;

    public BookingState() {

    }

    public BookingState(Float amountPaid) {

        this.amountPaid = amountPaid;
        // this.isComplete = isComplete;
    }

    public Float getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    // public boolean getIsComplete() {
    // return this.isComplete;
    // }

    // public void setIsComplete(boolean isComplete) {
    // this.isComplete = isComplete;
    // }
}
