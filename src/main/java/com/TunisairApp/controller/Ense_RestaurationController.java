package com.TunisairApp.controller;

import com.TunisairApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Ense_RestaurationController {

    @Autowired
    EntrepriseRestaurationService entreprise_restaurationService;

    public Ense_RestaurationController(EntrepriseRestaurationService entreprise_restaurationService) {
        super();
        this.entreprise_restaurationService = entreprise_restaurationService;
    }
}
