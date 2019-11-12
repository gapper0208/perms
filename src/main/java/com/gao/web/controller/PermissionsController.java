package com.gao.web.controller;

import com.gao.domain.Permissions;
import com.gao.service.PermissionsService;
import com.gao.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("permissions")
public class PermissionsController {

    @Autowired
    private PermissionsService service;

    @PostMapping
    public ResultVO save(Permissions p) {
        ResultVO resultVO = new ResultVO();
        try {
            service.save(p);
            resultVO.setData(p);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @DeleteMapping("{pid}")
    public ResultVO delete(@PathVariable Integer pid) {
        ResultVO resultVO = new ResultVO();
        try {
            service.delete(pid);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @PutMapping
    public ResultVO update(Permissions p) {
        ResultVO resultVO = new ResultVO();
        try {
            service.update(p);
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
            List<Permissions> list = service.findAll();
            resultVO.setData(list);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }

    @GetMapping("{pid}")
    public ResultVO findOne(@PathVariable Integer pid) {
        ResultVO resultVO = new ResultVO();
        try {
            Permissions p = service.findOne(pid);
            resultVO.setData(p);
            resultVO.setStatusCode(ResultVO.Status.OK);
        } catch (Exception e) {
            resultVO.setMessage(e.toString());
            resultVO.setStatusCode(ResultVO.Status.S_ERROR);
        }
        return resultVO;
    }
}
