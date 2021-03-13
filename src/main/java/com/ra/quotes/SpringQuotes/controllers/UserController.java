package com.ra.quotes.SpringQuotes.controllers;


import com.ra.quotes.SpringQuotes.datamodel.User;
import com.ra.quotes.SpringQuotes.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping("/users")
    List<User> getAllUsers() {
        //this endpoint should only be accessible by a high privileged user, will get to that later.

        return userService.getAllUsers();

    }

}
