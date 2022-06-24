package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.AccountDetails;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class UserService {
    @Value("${url}")
    public String url;

    private final RestClient restClient;
    private final UserRepository userRepository;

    public UserService(RestClient restClient, UserRepository userRepository) {
        this.restClient = restClient;
        this.userRepository = userRepository;
    }

    public List<String> getUserName(String subStr) {
        if (subStr != null) {
            url += subStr;
        }
        restClient.callGetUseraAPI(url);

        return new ArrayList<>();
    }
// hello world

    void savedata(AccountDetails stud) {
        String result = stud.getName();
        UserEntity userEntity = userRepository.findByName(result);
        if (Objects.isNull(userEntity)) {
            userEntity = new UserEntity();
            userEntity.setName(result);
            userEntity.setGetcount(1);
        } else {
            userEntity.setGetcount(userEntity.getGetcount() + 1);
        }
        userRepository.save(userEntity);
    }


}
