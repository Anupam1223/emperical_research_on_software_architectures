package com.fyp.ownerrelated.owner.application.queryservice;

import com.fyp.ownerrelated.owner.infrastructure.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class QueryOwnerService {

    @Autowired(required = true)
    private OwnerRepository ownerRepository;

    public QueryOwnerService() {

    }

    public QueryOwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public int returnBookingAmount(int flatId) {

        return ownerRepository.findById(flatId);
    }

}
