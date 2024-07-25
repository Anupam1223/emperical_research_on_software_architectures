package com.fyp.homrent.renting.interfaces.dto.source;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentResource {
    public String rentId;
    public String firstname;
    public String lastname;
    public int age;
    public boolean maritalStatus;
    public String profession;
    public String flatID;
}
