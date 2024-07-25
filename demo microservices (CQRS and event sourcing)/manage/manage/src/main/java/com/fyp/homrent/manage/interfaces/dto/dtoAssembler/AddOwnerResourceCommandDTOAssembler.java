package com.fyp.homrent.manage.interfaces.dto.dtoAssembler;

import com.fyp.homrent.manage.domain.model.commands.AddOwnerCommand;
import com.fyp.homrent.manage.interfaces.dto.resource.AddOwnerResource;

public class AddOwnerResourceCommandDTOAssembler {

    public static AddOwnerCommand toAddOwnerCommand(AddOwnerResource addOwnerResource) {
        return new AddOwnerCommand(
                addOwnerResource.getOwnerName(),
                addOwnerResource.getLocation(),
                addOwnerResource.getBooking_amount(),
                addOwnerResource.getMonthly_rent(),
                addOwnerResource.getType(),
                addOwnerResource.getFlatId());
    }
}
