package com.fyp.homrent.shareddomain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlatRentedEvent {
    private String rentId;
    private String firstname;
    private String lastname;
    private int age;
    private boolean maritalStatus;
    public String profession;
    private String flatID;
    private RentingStatus rentingStatus = RentingStatus.NOT_BOOKED;

}
