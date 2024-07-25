package com.fyp.homrent.renting.data;

import com.fyp.homrent.renting.model.aggregate.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Long> {

    Rent findByRentId(String RentId);
}
