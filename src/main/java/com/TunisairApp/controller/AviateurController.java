package com.TunisairApp.controller;

import com.TunisairApp.service.AviateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class AviateurController {
    @Autowired
    AviateurService aviateurService;

    public AviateurController(AviateurService aviateurService) {
        super();
        this.aviateurService = aviateurService;
    }
}
