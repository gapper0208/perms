package com.gao.service.impl;

import com.gao.dao.UsersMapper;
import com.gao.domain.Users;
import com.gao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper mapper;

    @Transactional
    @Override
    public void save(Users users) {
        mapper.insertSelective(users);
    }
    @Transactional
    @Override
    public void delete(Integer rid) {
        mapper.deleteByPrimaryKey(rid);
    }
    @Transactional
    @Override
    public void update(Users users) {
        mapper.updateByPrimaryKeySelective(users);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Users> findAll() {
        return mapper.selectByExample(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Users findOne(Integer rid) {
        return mapper.selectByPrimaryKey(rid);
    }
}
