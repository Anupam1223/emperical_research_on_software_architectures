package com.fyp.renthouse.renting.infrastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface RentEventSource {

    @Output("flatBookingChannel")
    MessageChannel flatBooking();
}
