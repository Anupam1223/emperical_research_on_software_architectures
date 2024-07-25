package com.fyp.homrent.manage.interfaces;

import com.fyp.homrent.manage.application.commandservice.AddOwnerCommandService;
import com.fyp.homrent.manage.application.queryservice.QueryOwnerService;
import com.fyp.homrent.manage.domain.model.data.OwnerId;
import com.fyp.homrent.manage.interfaces.dto.dtoAssembler.AddOwnerResourceCommandDTOAssembler;
import com.fyp.homrent.manage.interfaces.dto.dtoAssembler.ChangeStateOfFlatDTOAssembler;
import com.fyp.homrent.manage.interfaces.dto.resource.AddOwnerResource;
import com.fyp.homrent.manage.interfaces.dto.resource.ChangeStateOfFlatResource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String bookCargo(@RequestBody String flatId) {

        return queryOwnerService.returnBookingAmount(flatId);
    }

    @PostMapping("/addowner")
    public OwnerId addOwner(@RequestBody AddOwnerResource addOwnerResource) {

        OwnerId orderid = addOwnerCommandService
                .addOwner(AddOwnerResourceCommandDTOAssembler.toAddOwnerCommand(addOwnerResource));
        return orderid;
    }

    @PostMapping("/updateflat")
    public void changeStateOfFLat(@RequestBody ChangeStateOfFlatResource resource) {

        addOwnerCommandService
                .ChangeStateCommand(ChangeStateOfFlatDTOAssembler.toChangeStateFlatCommand(resource));
    }

}