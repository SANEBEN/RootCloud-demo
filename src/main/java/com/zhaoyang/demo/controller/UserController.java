package com.zhaoyang.demo.controller;

import com.zhaoyang.demo.dao.UserService;
import com.zhaoyang.demo.entity.User;
import com.zhaoyang.demo.util.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾昭阳
 * @date 2021/2/16 9:43
 * @email 473811301@qq.com
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping("/getById")
    public ResultVO<User> getById(int id) {
        return ResultVO.SUCCESS(service.getById(id));
    }

    @RequestMapping("/getByName")
    public ResultVO<User> getByName(String name) {
        return ResultVO.SUCCESS(service.getByName(name));
    }

    @RequestMapping("/insert")
    public ResultVO<Object> insert(String name) {
        if (service.insert(name)) {
            return ResultVO.SUCCESS();
        } else {
            return ResultVO.ERROR();
        }
    }

    @RequestMapping("/delete")
    public ResultVO<Object> delete(int id) {
        if (service.delete(id)) {
            return ResultVO.SUCCESS();
        } else {
            return ResultVO.ERROR();
        }
    }

}
