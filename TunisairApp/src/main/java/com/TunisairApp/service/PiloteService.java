package com.TunisairApp.service;

import com.TunisairApp.repository.PiloteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiloteService {
    @Autowired
    PiloteRepository piloteRepository;
}
