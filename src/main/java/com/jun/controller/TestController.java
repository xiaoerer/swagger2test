package com.jun.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zz on 2017/8/23.
 */
@Controller
@RequestMapping(value = "/users")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView getIndex(){
        System.out.println("测试成功");
        ModelAndView mav=new ModelAndView();
        mav.setViewName("/index.jsp");
        return mav;
    }

}
