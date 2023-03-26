package com.TunisairApp.service;

import com.TunisairApp.repository.AviateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AviateurService {
    @Autowired
    AviateurRepository aviateurRepository;
}
