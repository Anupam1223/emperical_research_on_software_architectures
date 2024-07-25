package com.fyp.homrent.renting.application.querygateways;

import javax.persistence.EntityManager;
import com.fyp.homrent.renting.domain.projections.FlatStatusProjection;
import org.springframework.stereotype.Service;

@Service
public class RentingProjectionService {

    private EntityManager entityManager;

    public RentingProjectionService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Stores the status of flat
     *
     * @param flatStatus
     */
    public void storeRenting(FlatStatusProjection flatStatus) {
        entityManager.persist(flatStatus);
    }

}
