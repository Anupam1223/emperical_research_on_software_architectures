package com.fyp.renthouse.renting.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fyp.renthouse.renting.domain.model.aggregate.Rent;

public interface RentRepository extends JpaRepository<Rent, Long> {

    Rent findByRentId(String RentId);
}
