package com.TunisairApp.service;

import com.TunisairApp.repository.AviateurRepository;
import com.TunisairApp.repository.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolService {
    @Autowired
    VolRepository volRepository;
}
