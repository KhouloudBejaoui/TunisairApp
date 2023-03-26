package com.TunisairApp.service;


import com.TunisairApp.repository.EntrepriseRestaurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseRestaurationService {
    @Autowired
    EntrepriseRestaurationRepository entreprise_restaurationRepository;
}
