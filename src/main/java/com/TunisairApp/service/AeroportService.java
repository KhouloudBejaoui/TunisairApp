package com.TunisairApp.service;

import com.TunisairApp.repository.AeroportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeroportService {
    @Autowired
    AeroportRepository aeroportRepository;
}
