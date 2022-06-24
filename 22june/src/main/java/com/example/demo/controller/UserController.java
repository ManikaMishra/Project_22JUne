package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController  //tell that this is controller
@RequestMapping("/users")  //endpoint
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public List<String> getUserName(@RequestParam(value = "names", required = false) String names) throws IOException {
        return userService.getUserName(names);
    }


    @PostMapping()
    public String createUsers() {
        return "HTTP POST request was sent";
    }

    @DeleteMapping()
    public String deleteUsers() {
        return "HTTP DELETE request was sent";
    }

    @PutMapping()
    public String updateUsers() {
        return "HTTP PUT request was sent";
    }


}
