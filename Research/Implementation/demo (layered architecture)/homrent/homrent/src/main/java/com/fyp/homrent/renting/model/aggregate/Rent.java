package com.fyp.homrent.renting.model.aggregate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fyp.homrent.renting.model.commands.RentFlatCommand;
import com.fyp.homrent.renting.model.entities.Tenant;

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
    @Column(name = "flat_id")
    private String flatId;
    public Rent() {
    }
    public Rent(RentFlatCommand rentFlatCommand) {
        this.personToRent = new Tenant(rentFlatCommand.firstname, rentFlatCommand.lastname,
        rentFlatCommand.age, rentFlatCommand.maritalStatus, rentFlatCommand.profession); this.flatId = rentFlatCommand.flatId;
        this.rentId = new RentId(rentFlatCommand.getRentId());
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
