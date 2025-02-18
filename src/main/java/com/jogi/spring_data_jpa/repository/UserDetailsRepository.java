package com.jogi.spring_data_jpa.repository;

import com.jogi.spring_data_jpa.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,
        Long> {




}


