package com.gao.service;

import com.gao.domain.Permissions;

import java.util.List;

public interface PermissionsService {
    void save(Permissions p);
    void delete(Integer pid);
    void update(Permissions p);
    List<Permissions> findAll();
    Permissions findOne(Integer pid);
}
