package com.fyp.homrent.renting.interfaces.eventhandler;

import java.lang.invoke.MethodHandles;

import com.fyp.homrent.renting.application.querygateways.RentingProjectionService;
import com.fyp.homrent.renting.domain.events.FlatRentedEvent;
import com.fyp.homrent.renting.domain.projections.FlatStatusProjection;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class FlatRentedEventHandler {

    private RentingProjectionService rentingProjectionService; // Dependencies
    private final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public FlatRentedEventHandler(RentingProjectionService rentingProjectionService) {
        this.rentingProjectionService = rentingProjectionService;
    }

    @EventHandler
    public void on(FlatRentedEvent flatRentedEvent) {

        logger.info("flatId {}", flatRentedEvent.getFlatID());

        FlatStatusProjection flatStatus = new FlatStatusProjection(flatRentedEvent.getFlatID(),
                flatRentedEvent.getFirstname(), flatRentedEvent.getRentingStatus());
        rentingProjectionService.storeRenting(flatStatus);
    }
}
