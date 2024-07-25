package com.fyp.managerenting.manage.interfaces;

import com.fyp.managerenting.manage.application.outboundservices.acl.FetchOwnerInformation;
import com.fyp.managerenting.manage.domain.model.aggregates.JustTest;
import com.fyp.managerenting.manage.infrastructure.repositories.ManageRepository;
import com.fyp.managerenting.sharedkernel.events.FlatBookedEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.messaging.Sink;

// @RestController
@Service
@EnableBinding(Sink.class)
public class ManageFlatController {

    @Autowired(required = true)
    private ManageRepository manageRepository;

    @Autowired(required = true)
    FetchOwnerInformation fetchBalance;

    public ManageFlatController(FetchOwnerInformation fetchBalance) {
        this.fetchBalance = fetchBalance;
    }

    @StreamListener(target = Sink.INPUT)
    public void receiveEvent(FlatBookedEvent flatBookedEvent) {

        JustTest test = new JustTest(flatBookedEvent);
        System.out.print("Id " + flatBookedEvent.getOwnerId() + " amount -> " + test.getBookingAmount());
        int bookingAmount = fetchBalance.fetchBookingAmount(1);

        if (flatBookedEvent.getBookingAmount() < bookingAmount) {
            test.setRemaining_amount(bookingAmount - flatBookedEvent.getBookingAmount());
        } else {
            test.setRemaining_amount(0);
        }
        manageRepository.save(test);
    }
}