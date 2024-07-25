package com.fyp.homrent.manage.application.commandservice;

import java.util.UUID;

import com.fyp.homrent.manage.domain.model.commands.AddOwnerCommand;
import com.fyp.homrent.manage.domain.model.commands.ChangeFlatStateCommand;
import com.fyp.homrent.manage.domain.model.data.Owner;
import com.fyp.homrent.manage.domain.model.data.OwnerId;
import com.fyp.homrent.manage.infrastructure.repositories.OwnerRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddOwnerCommandService {

    @Autowired(required = true)
    private OwnerRepository1 ownerRepository;

    public OwnerId addOwner(AddOwnerCommand addOwnerCommand) {

        String random = UUID.randomUUID().toString().toUpperCase();
        addOwnerCommand.setOwnerId(random.substring(0, random.indexOf("-")));
        Owner owner = new Owner(addOwnerCommand);
        ownerRepository.save(owner);
        return new OwnerId(random);
    }

    public void ChangeStateCommand(ChangeFlatStateCommand command) {
        log.info("inside UpdateStateOfFlat");
        // Owner owner =
        ownerRepository.updateFlat(command.getFlatId());
        // owner.setFlat();
        // ownerRepository.save(owner);
    }

}
