package com.fyp.ownerrelated.owner.infrastructure.repositories;

import com.fyp.ownerrelated.owner.domain.model.aggregates.Owner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Integer findById(int flatId);
}
