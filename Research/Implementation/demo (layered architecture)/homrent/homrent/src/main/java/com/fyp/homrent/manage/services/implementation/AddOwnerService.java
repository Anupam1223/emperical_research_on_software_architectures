package com.fyp.homrent.manage.services.implementation;

import java.util.UUID;

import com.fyp.homrent.manage.data.OwnerRepository;
import com.fyp.homrent.manage.model.aggregate.Owner;
import com.fyp.homrent.manage.model.aggregate.OwnerId;
import com.fyp.homrent.manage.model.commands.AddOwnerCommand;
import com.fyp.homrent.manage.services.IAddOwnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddOwnerService implements IAddOwnerService {

    @Autowired(required = true)
    private OwnerRepository ownerRepository;

    @Override
    public OwnerId addOwner(AddOwnerCommand addOwnerCommand) {

        String random = UUID.randomUUID().toString().toUpperCase();
        addOwnerCommand.setOwnerId(random.substring(0, random.indexOf("-")));
        Owner owner = new Owner(addOwnerCommand);
        ownerRepository.save(owner);
        return new OwnerId(random);
    }
}
