package com.stackroute.sbservice.controller;

import com.stackroute.sbservice.exception.UserAlreadyExistsException;
import com.stackroute.sbservice.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.sbservice.model.Person;
import com.stackroute.sbservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/create")
    public ResponseEntity<?> registerUser(@RequestBody Person user) throws UserAlreadyExistsException {
        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody Person user) throws UserNotFoundException {
        return new ResponseEntity<>(userService.updateProfile(user), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<?> listAllUsers() {
        return new ResponseEntity<>(userService.listAllUsers(), HttpStatus.OK);
    }

}