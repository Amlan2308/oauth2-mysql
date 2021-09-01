package com.oauthdb.oauth.repository;

import java.util.Optional;

import com.oauthdb.oauth.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
