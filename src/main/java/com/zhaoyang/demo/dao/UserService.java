package com.zhaoyang.demo.dao;

import com.zhaoyang.demo.dao.mapper.UserMapper;
import com.zhaoyang.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 曾昭阳
 * @date 2021/2/16 9:35
 * @email 473811301@qq.com
 */
@Service
public class UserService {

    private final UserMapper mapper;

    @Autowired
    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public boolean insert(String name) {
        return mapper.insert(name);
    }

    public User getById(int id) {
        return mapper.getById(id);
    }

    public User getByName(String name) {
        return mapper.getByName(name);
    }

    public boolean delete(int id) {
        return mapper.delete(id);
    }
}
