package com.yy.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yy.mapper.UserMapper;
import com.yy.pojo.User;
import com.yy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {
}
