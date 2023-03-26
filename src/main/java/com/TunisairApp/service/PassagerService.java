package com.TunisairApp.service;

import com.TunisairApp.repository.Ense_RestaurationRepository;
import com.TunisairApp.repository.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



    @Service
    public class PassagerService {
        @Autowired
        PassagerRepository passagerRepository;
    }

