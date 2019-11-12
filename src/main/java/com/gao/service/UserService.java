package com.gao.service;

import com.gao.domain.Users;

import java.util.List;

public interface UserService {
    void save(Users users);
    void delete(Integer rid);
    void update(Users users);
    List<Users> findAll();
    Users findOne(Integer rid);
}
