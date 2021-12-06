package com.atzzazz.factory;

import com.atzzazz.dao.UserDao;

/**
 * @Description：静态工厂类
 * @Author： zzazz
 * @Date： 2021/12/6 - 12:52
 */
public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDao();
    }
}
