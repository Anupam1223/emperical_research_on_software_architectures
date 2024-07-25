package com.fyp.homrent.rest.dto.transfer;

import com.fyp.homrent.renting.model.commands.RentFlatCommand;
import com.fyp.homrent.rest.dto.source.RentResource;

public class RentResourceDTOAssembler {

    public static RentFlatCommand toRentCargoCommand(RentResource rentResource) {
        return new RentFlatCommand(
                rentResource.getRentId(),
                rentResource.getFirstname(),
                rentResource.getLastname(),
                rentResource.getAge(),
                rentResource.isMaritalStatus(),
                rentResource.getProfession(),
                rentResource.getFlatId());

    }
}
