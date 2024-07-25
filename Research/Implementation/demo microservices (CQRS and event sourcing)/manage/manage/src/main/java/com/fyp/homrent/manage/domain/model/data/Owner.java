package com.fyp.homrent.manage.domain.model.data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fyp.homrent.manage.domain.model.commands.AddOwnerCommand;
import com.fyp.homrent.manage.domain.model.entities.Flat;

import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
@NamedQueries({
        @NamedQuery(name = "Owner.findById", query = "select flat.bookingAmount from Owner where flat_Id = :flatId")
})

public class Owner extends AbstractAggregateRoot<Owner> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    private OwnerId ownerId; // Aggregate Identifier

    @Embedded
    private Flat flat;

    @Column(name = "owner_name")
    private String ownerName;

    public Owner() {
    }

    public Owner(AddOwnerCommand addOwnerCommand) {
        ownerId = new OwnerId(addOwnerCommand.getOwnerId());
        flat = new Flat(addOwnerCommand.getLocation(), addOwnerCommand.getBooking_amount(),
                addOwnerCommand.getMonthly_rent(), addOwnerCommand.getType(), addOwnerCommand.getFlatId(), "");
        ownerName = addOwnerCommand.getOwnerName();

    }

    public OwnerId getOwnerId() {
        return ownerId;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat() {
        this.flat.setStatus("booked");
    }

}
