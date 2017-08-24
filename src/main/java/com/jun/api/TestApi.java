package com.jun.api;

import com.jun.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zz on 2017/8/24.
 */
@RestController
@RequestMapping(value = "/api")
public class TestApi {

    @ApiOperation(value = "测试", notes = "")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public User getIndex(){

        System.out.println("测试成功");
        User user=new User();
        user.setId(1);
        user.setUsername("xiaoer");
        user.setPassword("123456");
        return user;
    }

}
