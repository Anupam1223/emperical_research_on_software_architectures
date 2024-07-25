package com.fyp.homrent.manage.interfaces.dto.dtoAssembler;

import com.fyp.homrent.manage.domain.model.commands.ChangeFlatStateCommand;
import com.fyp.homrent.manage.interfaces.dto.resource.ChangeStateOfFlatResource;

public class ChangeStateOfFlatDTOAssembler {

    public static ChangeFlatStateCommand toChangeStateFlatCommand(ChangeStateOfFlatResource resource) {
        return new ChangeFlatStateCommand(
                resource.getFlatId());
    }
}
