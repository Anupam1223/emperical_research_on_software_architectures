package com.fyp.renthouse.renting.application.commandservices;

import java.util.UUID;

import com.fyp.renthouse.renting.domain.model.aggregate.Rent;
import com.fyp.renthouse.renting.domain.model.aggregate.RentId;
import com.fyp.renthouse.renting.domain.model.commands.RentFlatCommand;
import com.fyp.renthouse.renting.infrastructure.repositories.RentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookNewRentCommandService {

    @Autowired(required = true) // to prevent from nullPointerException
    private RentRepository rentRepository;

    /**
     * Service Command method to book a new Cargo
     * 
     * @return BookingId of the Cargo
     */

    public RentId rentFlat(RentFlatCommand rentFLatCommand) {

        String random = UUID.randomUUID().toString().toUpperCase();
        rentFLatCommand.setRentId(random.substring(0, random.indexOf("-")));
        Rent rent = new Rent(rentFLatCommand);
        rentRepository.save(rent);
        return new RentId(random);
    }
}
