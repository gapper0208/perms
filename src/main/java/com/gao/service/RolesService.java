package com.gao.service;

import com.gao.domain.Roles;

import java.util.List;


public interface RolesService {
    void save(Roles r);
    void delete(Integer rid);
    void update(Roles r);
    List<Roles> findAll();
    Roles findOne(Integer rid);
}
