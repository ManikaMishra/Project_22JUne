package com.example.demo.service;

import com.example.demo.model.AccountDetails;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class RestClient {

    RestTemplate restTemplate = new RestTemplate();

    List<AccountDetails> callGetUseraAPI(String url) {

        Gson gson = new Gson();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        Type ListofParameterType = new TypeToken<List<AccountDetails>>() {
        }.getType();
        List<AccountDetails> studentname = gson.fromJson(response.getBody(), ListofParameterType);
        System.out.println(response.getBody());
        return studentname;


    }
}
