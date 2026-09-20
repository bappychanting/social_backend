package com.example.social.domain.repository;

import com.example.social.domain.model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findFirstUser();
    User save(User user);
    List<User> findAll();
    long count();
}
