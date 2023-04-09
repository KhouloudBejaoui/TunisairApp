package com.TunisairApp.controller;

import com.TunisairApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class MenuController {

    @Autowired
    MenuService menuService;

    public MenuController(MenuService menuService) {
        super();
        this.menuService = menuService;
    }
}
