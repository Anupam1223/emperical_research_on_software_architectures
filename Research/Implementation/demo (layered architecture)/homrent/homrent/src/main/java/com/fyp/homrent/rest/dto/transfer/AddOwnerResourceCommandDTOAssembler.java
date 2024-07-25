package com.fyp.homrent.rest.dto.transfer;

import com.fyp.homrent.manage.model.commands.AddOwnerCommand;
import com.fyp.homrent.rest.dto.source.AddOwnerResource;

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
