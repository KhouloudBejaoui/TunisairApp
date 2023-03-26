package com.TunisairApp.service;


import com.TunisairApp.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {
    @Autowired
    EmployeRepository employeRepository;
}
