package com.TunisairApp.controller;

import com.TunisairApp.service.AviateurService;
import com.TunisairApp.service.AvionService;
import com.TunisairApp.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class AvionController {

    @Autowired
    AvionService avionService;

    public AvionController(AvionService avionService) {
        super();
        this.avionService = avionService;
    }
}
