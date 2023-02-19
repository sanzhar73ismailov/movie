package com.sanismail.movieweb.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import com.sanismail.movieweb.dto.UserDto;
import com.sanismail.movieweb.model.entity.User;
import com.sanismail.movieweb.repository.RoleRepository;
import com.sanismail.movieweb.repository.UserRepository;
import com.sanismail.movieweb.exception.UserAlreadyExistException;

//@Service
//@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    public User registerNewUserAccount(UserDto accountDto) {
        if (emailExists(accountDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: " + accountDto.getEmail());
        }
        //PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
        final User user = User.builder()
                .email(accountDto.getEmail())
                //.password(passwordEncoder.encode(accountDto.getPassword()))
                //.password(accountDto.getPassword())
                .name(accountDto.getName())
                .roles(Set.of(roleRepository.findByName("ROLE_USER")))
                .build();
        return userRepository.save(user);
    }


    private boolean emailExists(String email) {
        return  userRepository.findByEmail(email) != null;
    }

}
