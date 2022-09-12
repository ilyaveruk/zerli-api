package com.zerli.zerliapi.services;

import com.zerli.zerliapi.entity.RoleEntity;
import com.zerli.zerliapi.entity.UserEntity;
import com.zerli.zerliapi.model.User;
import com.zerli.zerliapi.repository.RoleRepository;
import com.zerli.zerliapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    @Override
    public UserEntity saveUser(UserEntity userEntity) {

        return userRepository.save(userEntity);
    }

    @Override
    public RoleEntity saveRole(RoleEntity role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        UserEntity user = userRepository.findByUsername(username);
        RoleEntity role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public UserEntity getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}

