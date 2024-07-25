package com.fyp.homrent.renting.services.implementation;

import com.fyp.homrent.renting.data.RentRepository;
import com.fyp.homrent.renting.model.aggregate.Rent;
import com.fyp.homrent.renting.model.aggregate.RentId;
import com.fyp.homrent.renting.model.commands.RentFlatCommand;
import com.fyp.homrent.renting.services.IRentingRelatedServices;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentHouseService implements IRentingRelatedServices {

    @Autowired(required = true) // to prevent from nullPointerException
    private RentRepository rentRepository;

    @Override
    public RentId rentFlat(RentFlatCommand rentFlatCommand) {

        // perform necessary validations here
        String random = UUID.randomUUID().toString().toUpperCase();
        rentFlatCommand.setRentId(random.substring(0, random.indexOf("-")));
        Rent rent = new Rent(rentFlatCommand);
        rentRepository.save(rent);
        return new RentId(random);
    }

}
