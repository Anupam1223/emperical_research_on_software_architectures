package com.fyp.homrent.manage.domain.model.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChangeFlatStateCommand {

    @TargetAggregateIdentifier
    private final String flatId;
}
