package com.fyp.homrent.renting.interfaces.rest;

import java.util.UUID;

import com.fyp.homrent.renting.application.commandgateways.RentingCommandService;
import com.fyp.homrent.renting.interfaces.dto.source.RentResource;
import com.fyp.homrent.renting.interfaces.dto.transform.RentResourceDTOAssembly;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/renting")
public class RentFlatController {

    private RentingCommandService rentingCommandService;

    public RentFlatController(RentingCommandService rentingCommandService) {
        this.rentingCommandService = rentingCommandService;
    }

    @PostMapping("/rentflat")
    public String rentFlat(@RequestBody RentResource rentResource) {

        String random = UUID.randomUUID().toString();
        rentResource.setRentId(random.substring(0, random.indexOf("-")));
        rentingCommandService.rentFlat(RentResourceDTOAssembly.toRentCargoCommand(rentResource));
        return random;
    }
}