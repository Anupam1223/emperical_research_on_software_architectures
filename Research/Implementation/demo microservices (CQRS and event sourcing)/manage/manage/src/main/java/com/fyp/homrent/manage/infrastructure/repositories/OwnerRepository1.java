package com.fyp.homrent.manage.infrastructure.repositories;

import javax.transaction.Transactional;

import com.fyp.homrent.manage.domain.model.data.Owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OwnerRepository1 extends JpaRepository<Owner, Long> {

    String findById(String flatId);

    @Transactional
    @Modifying
    @Query("update Owner set status = 'booked' where flat_Id = :flatId")
    void updateFlat(String flatId);
}
