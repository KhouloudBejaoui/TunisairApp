package com.TunisairApp.controller;

import com.TunisairApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class EmployeController {

    @Autowired
    EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        super();
        this.employeService = employeService;
    }
}
