package com.TunisairApp.controller;

import com.TunisairApp.service.AviateurService;
import com.TunisairApp.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class VolController {
    @Autowired
    VolService volService;

    public VolController(VolService volService) {
        super();
        this.volService = volService;
    }
}
