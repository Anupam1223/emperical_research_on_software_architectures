package com.fyp.homrent.manage.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flat {

    @Column(name = "location")
    private String location;
    @Column(name = "booking_amount")
    private int bookingAmount;
    @Column(name = "monthly_rent")
    private int monthlyRent;
    @Column(name = "type")
    private String type;
    @Column(name = "flatId")
    private String flatId;
    @Column(name = "status")
    private String status = "not booked";
}
