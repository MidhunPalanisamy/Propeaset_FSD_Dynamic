package com.myprojects.Propease_BE.Repositoy;

import com.myprojects.Propease_BE.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
