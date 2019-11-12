package com.gao.web.controller;

import com.gao.domain.Users;
import com.gao.service.UserService;
import com.gao.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResultVO save(Users users) {
        ResultVO resultVO = new ResultVO();
        try {
            service.save(users);
            resultVO.setData(users);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @DeleteMapping("{uid}")
    public ResultVO delete(@PathVariable Integer uid) {
        ResultVO resultVO = new ResultVO();
        try {
            service.delete(uid);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @PutMapping
    public ResultVO update(Users users) {
        ResultVO resultVO = new ResultVO();
        try {
            service.update(users);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @GetMapping
    public ResultVO findAll() {
        ResultVO resultVO = new ResultVO();
        try {
            List<Users> list = service.findAll();
            resultVO.setData(list);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @GetMapping("{uid}")
    public ResultVO findOne(@PathVariable Integer uid) {
        ResultVO resultVO = new ResultVO();
        try {
            Users users = service.findOne(uid);
            resultVO.setData(users);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }
}
