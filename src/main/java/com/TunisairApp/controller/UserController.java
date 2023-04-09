package com.TunisairApp.controller;

import com.TunisairApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
}
