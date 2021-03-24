package com.yy.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yy.pojo.User;
import com.yy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/list")
    public List<User> getList() {
        QueryWrapper<User> qw = new QueryWrapper<>();

        List<User> list = service.list();
        log.info(list.toString());
        return list;
    }

    @RequestMapping("/addUser")
    public List<User> addUser() {
        User user = new User();
        user.setName("11");
        int id = service.list().size();
        service.save(user);
        user.setId(id + 1);
        List<User> list = service.list();
        log.info(list.toString());
        return list;
    }
}
