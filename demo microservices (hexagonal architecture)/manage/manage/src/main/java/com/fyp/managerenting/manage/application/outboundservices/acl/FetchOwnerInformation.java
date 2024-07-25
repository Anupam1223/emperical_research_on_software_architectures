package com.fyp.managerenting.manage.application.outboundservices.acl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchOwnerInformation {

    public int fetchBookingAmount(int flatid) {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Integer> params = new HashMap<>();
        params.put("flatid", flatid);

        int bookingAmount = restTemplate.getForObject("http://localhost:9193/owner/getflatinfo?flatid=" + flatid,
                Integer.class, params);

        return bookingAmount;
    }
}
