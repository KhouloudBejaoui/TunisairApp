package com.TunisairApp.controller;

import com.TunisairApp.service.PiloteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class PiloteController {
    @Autowired
    PiloteService piloteService;

    public PiloteController(PiloteService piloteService) {
        super();
        this.piloteService = piloteService;
    }

}
