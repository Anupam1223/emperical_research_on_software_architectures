package com.fyp.renthouse.renting.application.outboundservices;

import org.springframework.stereotype.Service;

@Service
public class FetchFlatIdFromLandlord {

    /**
     * fetch flatId from landlord bounded context
     * 
     * @param flatId
     * @return
     */
    public String fetchFlatId(String flatId) {

        return "10";

    }
}