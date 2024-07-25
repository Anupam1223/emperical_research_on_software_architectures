package com.fyp.homrent.renting.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tenant {
    private String firstname;
    private String lastname;
    private int age;
    private Boolean isMarried;
    private String profession;
}
