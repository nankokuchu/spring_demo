package com.atzzazz.controller;

import com.atzzazz.model.ResultInfo;
import com.atzzazz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Description：userController
 * @Author： zzazz
 * @Date： 2021/12/6 - 15:01
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    public ResultInfo userLogin(String userName,String password){
        ResultInfo resultInfo = userService.userLogin(userName, password);
        return resultInfo;
    }
}
