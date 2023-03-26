package com.TunisairApp.service;

import com.TunisairApp.repository.AvionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionService {
    @Autowired
    AvionRepository avionRepository;
}
