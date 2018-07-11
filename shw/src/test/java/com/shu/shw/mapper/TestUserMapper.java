package com.shu.shw.mapper;

import com.shu.shw.entity.User;
import com.shu.shw.entity.UserExample;
import com.shu.shw.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper {


    @Autowired
    private UserMapper userMapper;

    /**
     * 查询使用户信息
     */
        @Test
        public void contextLoads() {

            List<User> users = userMapper.selectByExample(new UserExample());
            for (User user : users) {
                System.out.println(user.getUsname());
            }


        }


}
