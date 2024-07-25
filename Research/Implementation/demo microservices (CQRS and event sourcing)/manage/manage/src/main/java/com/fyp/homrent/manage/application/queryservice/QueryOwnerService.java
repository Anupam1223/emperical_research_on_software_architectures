package com.fyp.homrent.manage.application.queryservice;

import com.fyp.homrent.manage.infrastructure.repositories.OwnerRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryOwnerService {

    @Autowired(required = true)
    private OwnerRepository1 ownerRepository;

    public QueryOwnerService() {

    }

    public QueryOwnerService(OwnerRepository1 ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public String returnBookingAmount(String flatId) {

        return ownerRepository.findById(flatId);
    }

}
