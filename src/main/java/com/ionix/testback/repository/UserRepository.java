package com.ionix.testback.repository;

import com.ionix.testback.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
