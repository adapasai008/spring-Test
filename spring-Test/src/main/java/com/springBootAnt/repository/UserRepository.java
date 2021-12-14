package com.springBootAnt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootAnt.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	Optional<UserEntity> findById(int userId);

}
