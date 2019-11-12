package com.gao.web.controller;

import com.gao.domain.Roles;
import com.gao.service.RolesService;
import com.gao.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("roles")
public class RolesController {
    @Autowired
    private RolesService service;

    @PostMapping
    public ResultVO save(Roles roles) {
        ResultVO resultVO = new ResultVO();
        try {
            service.save(roles);
            resultVO.setData(roles);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @DeleteMapping("{rid}")
    public ResultVO delete(@PathVariable Integer rid) {
        ResultVO resultVO = new ResultVO();
        try {
            service.delete(rid);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @PutMapping
    public ResultVO update(Roles roles) {
        ResultVO resultVO = new ResultVO();
        try {
            service.update(roles);
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
            List<Roles> list = service.findAll();
            resultVO.setData(list);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @GetMapping("{rid}")
    public ResultVO findOne(@PathVariable Integer rid) {
        ResultVO resultVO = new ResultVO();
        try {
            Roles r = service.findOne(rid);
            resultVO.setData(r);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }
}
