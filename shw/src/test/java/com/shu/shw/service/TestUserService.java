package com.shu.shw.service;

import com.shu.shw.entity.User;
import com.shu.shw.entity.UserExample;
import com.shu.shw.mapper.UserMapper;
import com.shu.shw.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {


    @Autowired
    private UserService userService;

    /**
     * 查询使用户信息
     */
    @Test
    public void contextLoads() {
        User user = new User();
        user.setUspassword("123");
        user.setUsname("zhangsan");
        userService.register(user);

    }

    /**
     * 测试登录
     */
    @Test
    public void testLogin() {
        User user = new User();
        user.setUspassword("123");
        user.setUsname("zhangsan");
        User login = userService.login(user);
        System.out.println(login);

    }

    /**
     * 所有不是管理员的信息
     */
    @Test
    public void testFindAll(){
/*
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user.getUsname());
        }*/


    }


}
