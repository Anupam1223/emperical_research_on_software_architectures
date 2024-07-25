package com.fyp.homrent.renting.application.commandgateways;

import com.fyp.homrent.renting.domain.commands.RentFlatCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

@Service
public class RentingCommandService {

    private final CommandGateway commandGateway;

    public RentingCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    /**
     * Book a Cargo
     * 
     * @param rentingCargoCommand
     */
    public void rentFlat(RentFlatCommand rentFlatCommand) {
        commandGateway.send(rentFlatCommand);
    }
}
