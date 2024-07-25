package com.fyp.managerenting.manage.domain.model.aggregates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fyp.managerenting.sharedkernel.events.FlatBookedEvent;
import org.springframework.data.domain.AbstractAggregateRoot;

import lombok.Data;

@Entity
@Data
public class JustTest extends AbstractAggregateRoot<JustTest> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "owner_id")
    private int owner_id;

    @Column(name = "booking_amount")
    private int bookingAmount;

    @Column(name = "remaining_amount")
    private int remaining_amount;

    public JustTest() {
    }

    public JustTest(FlatBookedEvent flatBookedEvent) {
        this.owner_id = flatBookedEvent.getOwnerId();
        this.bookingAmount = flatBookedEvent.getBookingAmount();
    }
}