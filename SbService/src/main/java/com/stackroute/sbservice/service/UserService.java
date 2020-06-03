package com.stackroute.sbservice.service;

import java.util.List;

import com.stackroute.sbservice.exception.UserAlreadyExistsException;
import com.stackroute.sbservice.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.sbservice.model.Person;
public interface UserService {

    /*
     * You Should not modify this interface. You have to implement these methods in
     * corresponding Impl classes
     */
    Person registerUser(Person user) throws UserAlreadyExistsException;

    Person updateProfile(Person user) throws UserNotFoundException;

    List<Person> listAllUsers();


}