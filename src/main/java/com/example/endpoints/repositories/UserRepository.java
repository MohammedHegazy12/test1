package com.example.endpoints.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.endpoints.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
