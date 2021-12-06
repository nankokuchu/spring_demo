package com.atzzazz.service;

import com.atzzazz.dao.UserDao;

/**
 * @Description：$
 * @Author： zzazz
 * @Date： 2021/12/6 - 11:49
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void printUserService() {
        System.out.println("UserService方法被调用.....");
        userDao.printUserDao();
    }


}
