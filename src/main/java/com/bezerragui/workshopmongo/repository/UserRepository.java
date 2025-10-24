package com.bezerragui.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bezerragui.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
