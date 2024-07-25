package com.fyp.renthouse.renting.interfaces.rest.transform;

import com.fyp.renthouse.renting.domain.model.commands.RentFlatCommand;
import com.fyp.renthouse.renting.interfaces.rest.dto.RentFlatResource;

public class RentFlatCommandDTOAssembler {

    /**
     * Static method within the Assembler class
     * 
     * @param rentFlatResource
     * @return BookCargoCommand Model
     */
    public static RentFlatCommand toCommandFromDTO(RentFlatResource rentFlatResource) {
        return new RentFlatCommand(
                rentFlatResource.firstname,
                rentFlatResource.lastname,
                rentFlatResource.age,
                rentFlatResource.maritalStatus,
                rentFlatResource.profession,
                rentFlatResource.flatID,
                rentFlatResource.bookingAmount);

    }
}
