package com.TunisairApp.controller;

import com.TunisairApp.dto.userDTO;
import com.TunisairApp.dto.userDTO;
import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.User;
import com.TunisairApp.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/")
public class UserController {
    public final static String FOUND = "FOUND";
    public final static String BAD_REQUEST = "BAD_REQUEST";
    public final static String NOT_FOUND = "NOT_FOUND";
    public final static String NULL = "ID NULL DETECTED";
    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping("/getUsers")
    @ResponseBody
    public List<userDTO> getUsers() {
        return userService.retrieveAllUsers().stream().map(user -> modelMapper.map(user, userDTO.class))
                .collect(Collectors.toList());

    }
    @GetMapping(value = "/getUser/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") long id) {
        ResponseEntity<User> user = userService.retrieveUser(id);
        if (user.getStatusCodeValue() == 200) {
            userDTO userDTO = modelMapper.map(user.getBody(), userDTO.class);
            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        } else if(user.getStatusCodeValue() == 404){
            return new ResponseEntity<>(NOT_FOUND,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(NULL,HttpStatus.OK);

        }
    }

    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@RequestBody userDTO userDTO) {
        User userReq = modelMapper.map(userDTO, User.class);
        ResponseEntity<User> user = userService.addUser(userReq);
        if (user.getStatusCodeValue() == 200) {
            userDTO userRes = modelMapper.map(user.getBody(), userDTO.class);
            return new ResponseEntity<>(userRes, HttpStatus.OK);
        } else if (user.getStatusCodeValue() == 400) {
            return new ResponseEntity<>(BAD_REQUEST, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(FOUND, HttpStatus.FOUND);
        }
    }


    @PutMapping(value = "/User/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") long id, @RequestBody userDTO userDTO) {
        User userReq = modelMapper.map(userDTO, User.class);
        ResponseEntity<User> user = userService.updateUser(id, userReq);

        if (user.getStatusCodeValue() == 200) {
            userDTO userRes = modelMapper.map(user.getBody(), userDTO.class);
            return new ResponseEntity<>(userRes, HttpStatus.OK);
        } else if (user.getStatusCodeValue() == 400) {
            return new ResponseEntity<>(BAD_REQUEST, HttpStatus.BAD_REQUEST);
        } else if(user.getStatusCodeValue() == 404){
            return new ResponseEntity<>(NOT_FOUND,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(NULL,HttpStatus.OK);

        }

    }

    @DeleteMapping(value = "/User/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);}
}

    