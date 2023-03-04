package com.TunisairApp.controller;

import com.TunisairApp.service.CopiloteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class CopiloteController {
    @Autowired
    CopiloteService copiloteService;

    public CopiloteController(CopiloteService copiloteService) {
        super();
        this.copiloteService = copiloteService;
    }
}
