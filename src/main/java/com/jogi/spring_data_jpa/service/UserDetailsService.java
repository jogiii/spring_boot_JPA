package com.jogi.spring_data_jpa.service;

import com.jogi.spring_data_jpa.entity.UserDetails;
import com.jogi.spring_data_jpa.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails user){
        userDetailsRepository.save(user);
    }

    public UserDetails findById(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }
}
