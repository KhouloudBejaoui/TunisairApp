package com.TunisairApp.service;


import com.TunisairApp.repository.Ense_RestaurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ense_RestaurationService {
    @Autowired
    Ense_RestaurationRepository ense_restaurationRepository;
}
