package com.fyp.homrent.manage.data;

import com.fyp.homrent.manage.model.aggregate.Owner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Integer findById(int flatId);
}
