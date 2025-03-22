package com.shopping.ecommerce.repository;

import com.shopping.ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}