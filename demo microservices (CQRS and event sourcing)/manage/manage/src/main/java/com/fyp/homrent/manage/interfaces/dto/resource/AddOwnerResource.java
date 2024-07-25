package com.fyp.homrent.manage.interfaces.dto.resource;

import lombok.Data;

@Data
public class AddOwnerResource {

    private String ownerName;
    private String location;
    private int booking_amount;
    private int monthly_rent;
    private String type;
    private String flatId;
}
