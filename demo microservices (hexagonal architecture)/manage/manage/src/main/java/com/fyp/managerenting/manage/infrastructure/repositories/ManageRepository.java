package com.fyp.managerenting.manage.infrastructure.repositories;

import com.fyp.managerenting.manage.domain.model.aggregates.JustTest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManageRepository extends JpaRepository<JustTest, String> {
}
