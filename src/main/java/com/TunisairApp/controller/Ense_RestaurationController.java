package com.TunisairApp.controller;

import com.TunisairApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Ense_RestaurationController {

    @Autowired
    Ense_RestaurationService ense_restaurationService;

    public Ense_RestaurationController(Ense_RestaurationService ense_restaurationService) {
        super();
        this.ense_restaurationService = ense_restaurationService;
    }
}
