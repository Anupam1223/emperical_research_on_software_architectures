package com.fyp.homrent.renting.application.outbounservices.acl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChangeFlatState {

    public static void changeFlatStatus(String flatId) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8081/owner/updateflat";
        String requestPayloadJson = String.format("{\"flatId\":\"%s\"}", flatId);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(requestPayloadJson, headers);

        restTemplate.postForObject(url, entity, String.class);

    }
}
