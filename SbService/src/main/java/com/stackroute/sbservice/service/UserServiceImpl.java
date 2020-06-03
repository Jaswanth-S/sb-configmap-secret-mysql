package com.stackroute.sbservice.service;

import com.stackroute.sbservice.exception.UserAlreadyExistsException;
import com.stackroute.sbservice.exception.UserNotFoundException;
import com.stackroute.sbservice.model.Person;
import com.stackroute.sbservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /*
     * Constructor Autowiring should be implemented for the UserRepository.
     */

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
     * Register a new User. Throw UserAlreadyExistsException if the user with specified
     * email already exists.
     */
    @Override
    public Person registerUser(Person person) throws UserAlreadyExistsException {
        if (userRepository.findById(person.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        return userRepository.save(person);
    }

    /*
     * Update an existing User by it's email. Throw UserNotFoundException if the
     * user with specified email does not exist.
     */
    @Override
    public Person updateProfile(Person person) throws UserNotFoundException {
        if (userRepository.findById(person.getEmail()).isEmpty()) {
            throw new UserNotFoundException();
        }
        return userRepository.save(person);
    }


    /*
     * Retrieve all existing users
     */
    @Override
    public List<Person> listAllUsers() {
        return userRepository.findAll();
    }

}
