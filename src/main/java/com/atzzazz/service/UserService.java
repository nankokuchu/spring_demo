package com.atzzazz.service;

import com.atzzazz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Author： zzazz
 * @Date： 2021/12/6 - 11:49
 */
@Service
public class UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Value("爱主主")
    private String name;

    public void printUserService() {
        System.out.println("UserService方法被调用.....");
        userDao.printUserDao();
        System.out.println(this.userDao);
    }


}
