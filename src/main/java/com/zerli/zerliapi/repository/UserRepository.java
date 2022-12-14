package com.zerli.zerliapi.repository;

import com.zerli.zerliapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByName(String name);
    UserEntity findByUsername(String username);
}
