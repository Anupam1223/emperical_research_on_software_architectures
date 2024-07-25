package com.fyp.ownerrelated.owner.application.commandservice;

import java.util.UUID;

import com.fyp.ownerrelated.owner.domain.model.aggregates.Owner;
import com.fyp.ownerrelated.owner.domain.model.aggregates.OwnerId;
import com.fyp.ownerrelated.owner.domain.model.commands.AddOwnerCommand;
import com.fyp.ownerrelated.owner.infrastructure.repositories.OwnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddOwnerCommandService {

    @Autowired(required = true)
    private OwnerRepository ownerRepository;

    public OwnerId addOwner(AddOwnerCommand addOwnerCommand) {

        String random = UUID.randomUUID().toString().toUpperCase();
        addOwnerCommand.setOwnerId(random.substring(0, random.indexOf("-")));
        Owner owner = new Owner(addOwnerCommand);
        ownerRepository.save(owner);
        return new OwnerId(random);
    }

}
