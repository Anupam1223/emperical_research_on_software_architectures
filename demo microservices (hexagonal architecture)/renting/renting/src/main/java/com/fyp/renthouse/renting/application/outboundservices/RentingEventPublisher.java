package com.fyp.renthouse.renting.application.outboundservices;

import com.fyp.renthouse.renting.infrastructure.brokers.rabbitmq.RentEventSource;
import com.fyp.renthouse.shareddomain.events.FlatBookedEvent;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(RentEventSource.class)
public class RentingEventPublisher {

    RentEventSource rentEventSource;

    public RentingEventPublisher(RentEventSource rentEventSource) {
        this.rentEventSource = rentEventSource;
    }

    @TransactionalEventListener
    public void handleFlatBookedEvent(FlatBookedEvent flatBookedEvent) {
        rentEventSource.flatBooking().send(MessageBuilder.withPayload(flatBookedEvent).build());
    }

}
