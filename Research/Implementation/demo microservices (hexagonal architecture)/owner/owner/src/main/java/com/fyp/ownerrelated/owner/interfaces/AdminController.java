package com.fyp.ownerrelated.owner.interfaces;

import com.fyp.ownerrelated.owner.application.commandservice.AddOwnerCommandService;
import com.fyp.ownerrelated.owner.application.queryservice.QueryOwnerService;
import com.fyp.ownerrelated.owner.domain.model.aggregates.OwnerId;
import com.fyp.ownerrelated.owner.interfaces.rest.dto.AddOwnerResource;
import com.fyp.ownerrelated.owner.interfaces.rest.transform.AddOwnerResourceCommandDTOAssembler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a Controller
@RequestMapping(path = "/owner")
public class AdminController {

    public AddOwnerCommandService addOwnerCommandService;
    public QueryOwnerService queryOwnerService;

    public AdminController(AddOwnerCommandService addOwnerCommandService, QueryOwnerService queryOwnerService) {
        this.addOwnerCommandService = addOwnerCommandService;
        this.queryOwnerService = queryOwnerService;
    }

    @GetMapping("/getflatinfo")
    public int bookCargo(@RequestParam("flatid") Integer flatId) {

        return queryOwnerService.returnBookingAmount(flatId);
    }

    @PostMapping("/addowner")
    public OwnerId addOwner(@RequestBody AddOwnerResource addOwnerResource) {

        OwnerId orderid = addOwnerCommandService
                .addOwner(AddOwnerResourceCommandDTOAssembler.toAddOwnerCommand(addOwnerResource));
        return orderid;
    }

}