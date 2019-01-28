package com.example.cloneInstagram.repos;

import com.example.cloneInstagram.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);

}