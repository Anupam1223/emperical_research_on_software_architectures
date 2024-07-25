package com.fyp.renthouse.renting.domain.model.aggregate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fyp.renthouse.renting.domain.model.commands.RentFlatCommand;
import com.fyp.renthouse.renting.domain.model.entities.Tenant;
import com.fyp.renthouse.renting.domain.model.valueobjects.BookingState;
import com.fyp.renthouse.shareddomain.events.FlatBookedEvent;

import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
public class Rent extends AbstractAggregateRoot<Rent> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private RentId rentId; // Aggregate Identifier
    @Embedded
    private Tenant personToRent;
    @Embedded
    private BookingState bookingState;
    @Column(name = "flat_id")
    private String flatId;

    public Rent() {
    }

    public Rent(RentFlatCommand rentFlatCommand) {
        this.personToRent = new Tenant(rentFlatCommand.firstname, rentFlatCommand.lastname,
                rentFlatCommand.age, rentFlatCommand.maritalStatus, rentFlatCommand.profession);
        this.flatId = rentFlatCommand.flatID;
        this.rentId = new RentId(rentFlatCommand.getRentId());
        this.bookingState = new BookingState(rentFlatCommand.getBookingAmount());
        // Add this domain event which needs to be fired when the new cargo is saved
        addDomainEvent(new FlatBookedEvent(1, 5000));
    }

    public String getFlatId() {
        return flatId;
    }

    public Long getId() {
        return id;
    }

    public Tenant getPersonToRent() {
        return personToRent;
    }

    public RentId getRentId() {
        return rentId;
    }

    /**
     * Method to register the event
     * 
     * @param event
     */
    public void addDomainEvent(Object event) {
        registerEvent(event);
    }
}
