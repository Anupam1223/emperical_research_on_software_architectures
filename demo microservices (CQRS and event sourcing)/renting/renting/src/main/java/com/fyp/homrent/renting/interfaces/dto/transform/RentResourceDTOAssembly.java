package com.fyp.homrent.renting.interfaces.dto.transform;

import com.fyp.homrent.renting.domain.commands.RentFlatCommand;
import com.fyp.homrent.renting.interfaces.dto.source.RentResource;

public class RentResourceDTOAssembly {

    public static RentFlatCommand toRentCargoCommand(RentResource rentResource) {
        return new RentFlatCommand(
                rentResource.getRentId(),
                rentResource.getFirstname(),
                rentResource.getLastname(),
                rentResource.getAge(),
                rentResource.isMaritalStatus(),
                rentResource.getProfession(),
                rentResource.getFlatID());

    }
}
