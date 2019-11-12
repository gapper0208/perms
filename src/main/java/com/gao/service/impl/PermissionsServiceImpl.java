package com.gao.service.impl;

import com.gao.dao.PermissionsMapper;
import com.gao.domain.Permissions;
import com.gao.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PermissionsServiceImpl implements PermissionsService {
    @Autowired
    private PermissionsMapper mapper;

    @Transactional
    @Override
    public void save(Permissions p) {
        mapper.insertSelective(p);
    }

    @Transactional
    @Override
    public void delete(Integer pid) {
        mapper.deleteByPrimaryKey(pid);
    }
    @Transactional
    @Override
    public void update(Permissions p) {
        mapper.updateByPrimaryKeySelective(p);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Permissions> findAll() {
        return mapper.selectByExample(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Permissions findOne(Integer pid) {
        return mapper.selectByPrimaryKey(pid);
    }
}