package com.fyp.ownerrelated.owner.interfaces.rest.transform;

import com.fyp.ownerrelated.owner.domain.model.commands.AddOwnerCommand;
import com.fyp.ownerrelated.owner.interfaces.rest.dto.AddOwnerResource;

public class AddOwnerResourceCommandDTOAssembler {

    public static AddOwnerCommand toAddOwnerCommand(AddOwnerResource addOwnerResource) {
        return new AddOwnerCommand(
                addOwnerResource.getOwnerName(),
                addOwnerResource.getLocation(),
                addOwnerResource.getBooking_amount(),
                addOwnerResource.getMonthly_rent(),
                addOwnerResource.getType());
    }
}
