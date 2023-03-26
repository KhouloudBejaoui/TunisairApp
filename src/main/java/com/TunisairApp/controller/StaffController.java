package com.TunisairApp.controller;

import com.TunisairApp.service.AviateurService;
import com.TunisairApp.service.AvionService;
import com.TunisairApp.service.StaffService;
import com.TunisairApp.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class StaffController {

    @Autowired
    StaffService staffService;

    public StaffController(StaffService staffService) {
        super();
        this.staffService = staffService;
    }
}
