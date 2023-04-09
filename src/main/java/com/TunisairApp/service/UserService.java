package com.TunisairApp.service;


import com.TunisairApp.repository.StaffRepository;
import com.TunisairApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
}
