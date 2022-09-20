package com.zerli.zerliapi.services;

import com.zerli.zerliapi.entity.RoleEntity;
import com.zerli.zerliapi.entity.UserEntity;
import com.zerli.zerliapi.model.Role;

import java.util.List;

public interface UserService {
    UserEntity saveUser(UserEntity userEntity);
    RoleEntity saveRole(RoleEntity role);
    void addRoleToUser(String username, String roleName);
    UserEntity getUser(String username);

    RoleEntity getRole(String username);
    List<UserEntity> getUsers();

}
