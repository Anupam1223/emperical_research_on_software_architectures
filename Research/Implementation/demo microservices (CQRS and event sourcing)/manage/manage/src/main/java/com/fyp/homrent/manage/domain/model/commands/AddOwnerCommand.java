package com.fyp.homrent.manage.domain.model.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOwnerCommand {

    private String ownerName;
    private String location;
    private int booking_amount;
    private int monthly_rent;
    private String ownerId;
    private String type;
    private String flatId;

    public AddOwnerCommand(String ownerName, String location, int booking_amount, int monthly_rent, String type,
            String flatId) {

        this.ownerName = ownerName;
        this.location = location;
        this.booking_amount = booking_amount;
        this.monthly_rent = monthly_rent;
        this.type = type;
        this.flatId = flatId;
    }
}
