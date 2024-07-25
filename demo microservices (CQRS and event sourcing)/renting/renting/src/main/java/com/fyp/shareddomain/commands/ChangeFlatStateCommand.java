package com.fyp.shareddomain.commands;

// import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChangeFlatStateCommand {

    private final String flatId;
}
