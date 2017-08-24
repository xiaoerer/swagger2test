package com.jun.api;

import com.jun.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zz on 2017/8/24.
 */
@RestController
@RequestMapping(value = "/api")
public class TestApi {

    @ApiOperation(value = "测试", notes = "")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public User getIndex(HttpServletRequest request){

        /*
        这里是获取api_key用来进行权限验证的，从登陆接口返回一个token,然后拿着这个token就是一个api_key，
        每一个请求都要带着这个token来验证，是否该用户已经登录
         */
        Object api_key=request.getHeader("api_key");

        System.out.println("测试成功");
        System.out.println(api_key.toString());
        User user=new User();
        user.setId(1);
        user.setUsername("xiaoer");
        user.setPassword("123456");
        return user;
    }

}
