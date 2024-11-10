package com.atalar.software.user.repository;

import java.util.Optional;

import com.atalar.software.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
