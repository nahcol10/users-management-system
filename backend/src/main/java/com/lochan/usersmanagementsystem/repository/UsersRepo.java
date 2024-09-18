package com.lochan.usersmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lochan.usersmanagementsystem.entity.OurUsers;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {

    Optional<OurUsers> findByEmail(String email);
}
