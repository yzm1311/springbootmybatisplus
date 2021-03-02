package com.yy;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yy.mapper.UserMapper;
import com.yy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class mybatisApplicationTest {


    @Autowired
    private UserMapper mapper;

    @Test
    void main() {
    }

    /**
     * 查询全部
     */
    @Test
    void findAll(){
        List<User> users = mapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 更新 通过id
     */
    @Test
    void updateById(){
        User user = new User();
        user.setId(5);
        user.setAge("123");
        user.setName("sdad");
        int i = mapper.updateById(user);
    }

    /**
     * 更新通过实体类
     */
    @Test
    void update(){
        User user = new User();
        user.setId(100);
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.eq("id", "5");
        userUpdateWrapper.set("id",20);
        int update = mapper.update(user, userUpdateWrapper);

        System.out.println(update);
    }

    @Test
    void selectByid(){

    }

}