package com.TunisairApp.service;

import com.TunisairApp.repository.CopiloteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopiloteService {
    @Autowired
    CopiloteRepository copiloteRepository;
}
