package com.fyp.renthouse.renting.interfaces;

import com.fyp.renthouse.renting.application.commandservices.BookNewRentCommandService;
import com.fyp.renthouse.renting.domain.model.aggregate.RentId;
import com.fyp.renthouse.renting.interfaces.rest.dto.RentFlatResource;
import com.fyp.renthouse.renting.interfaces.rest.transform.RentFlatCommandDTOAssembler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/rentflat")
public class RentingFlatController {

    private BookNewRentCommandService rentingCommandService; // Application Service Dependency

    /**
     * Provide the dependencies
     * 
     * @param rentingCommandService
     */
    public RentingFlatController(BookNewRentCommandService rentingCommandService) {
        this.rentingCommandService = rentingCommandService;
    }

    /**
     * POST method to book a cargo
     * 
     * @param rentFlatResource
     */

    @PostMapping
    @ResponseBody
    public RentId bookCargo(@RequestBody RentFlatResource rentFlatResource) {
        RentId rentId = rentingCommandService.rentFlat(
                RentFlatCommandDTOAssembler.toCommandFromDTO(rentFlatResource));

        return rentId;
    }
}
