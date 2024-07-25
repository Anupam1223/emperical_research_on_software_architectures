package com.fyp.homrent.rest;

import com.fyp.homrent.manage.model.aggregate.OwnerId;
import com.fyp.homrent.manage.services.implementation.AddOwnerService;
import com.fyp.homrent.renting.services.implementation.RentHouseService;
import com.fyp.homrent.rest.dto.source.AddOwnerResource;
import com.fyp.homrent.rest.dto.source.RentResource;
import com.fyp.homrent.rest.dto.transfer.AddOwnerResourceCommandDTOAssembler;
import com.fyp.homrent.rest.dto.transfer.RentResourceDTOAssembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/renting")
public class RentingController {

    @Autowired(required = true)
    private RentHouseService rentService;

    @Autowired(required = true)
    public AddOwnerService addOwnerCommandService;

    @PostMapping("/rentflat")
    public String rentFlat(@RequestBody RentResource rentResource) {

        rentService.rentFlat(RentResourceDTOAssembler.toRentCargoCommand(rentResource));
        return "rented";
    }

    @PostMapping("/addowner")
    public OwnerId addOwner(@RequestBody AddOwnerResource addOwnerResource) {

        OwnerId orderid = addOwnerCommandService
                .addOwner(AddOwnerResourceCommandDTOAssembler.toAddOwnerCommand(addOwnerResource));
        return orderid;
    }

}
