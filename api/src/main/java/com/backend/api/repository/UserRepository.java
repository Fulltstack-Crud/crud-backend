package com.backend.api.repository;

import com.backend.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

   UserDetails findByLogin(String login);
}
