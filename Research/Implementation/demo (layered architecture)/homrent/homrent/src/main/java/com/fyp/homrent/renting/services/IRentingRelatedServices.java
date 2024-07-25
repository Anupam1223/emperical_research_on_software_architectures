package com.fyp.homrent.renting.services;

import com.fyp.homrent.renting.model.aggregate.RentId;
import com.fyp.homrent.renting.model.commands.RentFlatCommand;

public interface IRentingRelatedServices {

    RentId rentFlat(RentFlatCommand rentFlatCommand);
}
