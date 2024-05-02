package com.ancientdiv.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ancientdiv.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
    

