package com.fyp.homrent.manage.services;

import com.fyp.homrent.manage.model.aggregate.OwnerId;
import com.fyp.homrent.manage.model.commands.AddOwnerCommand;

public interface IAddOwnerService {

    OwnerId addOwner(AddOwnerCommand addOwnerCommand);
}
