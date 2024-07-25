package com.fyp.homrent.renting.domain.aggregate;

import com.fyp.homrent.renting.application.outbounservices.acl.ChangeFlatState;
import com.fyp.homrent.renting.domain.commands.RentFlatCommand;
import com.fyp.homrent.renting.domain.entities.Tenant;
import com.fyp.homrent.renting.domain.events.FlatRentedEvent;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import lombok.NoArgsConstructor;

@Aggregate
@NoArgsConstructor
public class Rent {
    @AggregateIdentifier
    private String rentId;
    public Tenant tenant;
    public String flatID;
    public RentingStatus rentingStatus;

    @CommandHandler
    public Rent(RentFlatCommand rentFlatCommand) {
        FlatRentedEvent flatRentedEvent = new FlatRentedEvent(rentFlatCommand.getRentId(),
                rentFlatCommand.getFirstname(), rentFlatCommand.getLastname(),
                rentFlatCommand.getAge(), rentFlatCommand.isMaritalStatus(), rentFlatCommand.getProfession(),
                rentFlatCommand.getFlatID(), RentingStatus.RENTED);
        ChangeFlatState.changeFlatStatus(rentFlatCommand.getFlatID());
        AggregateLifecycle.apply(flatRentedEvent);
    }

    @EventSourcingHandler
    public void on(FlatRentedEvent event) {
        this.rentId = event.getRentId();
        new Tenant(event.getFirstname(), event.getLastname(), event.getAge(), event.isMaritalStatus(),
                event.getProfession());
        this.flatID = event.getFlatID();
        this.rentingStatus = event.getRentingStatus();
    }
}
