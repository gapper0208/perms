package com.gao.service.impl;

import com.gao.dao.RolesMapper;
import com.gao.domain.Roles;
import com.gao.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesMapper mapper;

    @Transactional
    @Override
    public void save(Roles r) {
        mapper.insertSelective(r);
    }

    @Transactional
    @Override
    public void delete(Integer rid) {
        mapper.deleteByPrimaryKey(rid);
    }

    @Transactional
    @Override
    public void update(Roles r) {
        mapper.updateByPrimaryKeySelective(r);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Roles> findAll() {
        return mapper.selectByExample(null);
    }


    @Transactional(readOnly = true)
    @Override
    public Roles findOne(Integer rid) {
        return mapper.selectByPrimaryKey(rid);
    }

}
