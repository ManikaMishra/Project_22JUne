package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Transactional
    UserEntity findByName(String name);     //finds name
}
