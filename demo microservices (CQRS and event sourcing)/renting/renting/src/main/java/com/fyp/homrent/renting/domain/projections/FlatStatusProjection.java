package com.fyp.homrent.renting.domain.projections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fyp.homrent.renting.domain.aggregate.RentingStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "status_projection")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlatStatusProjection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flatStatusId;
    @Column
    private String flatId;
    @Column
    private String username;
    @Column
    @Enumerated(EnumType.STRING)
    private RentingStatus status;

    public FlatStatusProjection(String flatId, String username, RentingStatus status) {
        this.flatId = flatId;
        this.username = username;
        this.status = status;
    }
}