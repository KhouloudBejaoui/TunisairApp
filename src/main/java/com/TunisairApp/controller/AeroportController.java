package com.TunisairApp.controller;

import com.TunisairApp.service.AeroportService;
import com.TunisairApp.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class AeroportController {
    @Autowired
    AeroportService aeroportService;

    public AeroportController(AeroportService aeroportService) {
        super();
        this.aeroportService = aeroportService;
    }
}
