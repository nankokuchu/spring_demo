package com.atzzazz.factory;

import com.atzzazz.dao.UserDao;

/**
 * @Description：实例工厂获取bean
 * @Author： zzazz
 * @Date： 2021/12/6 - 13:01
 */
public class InstanceFactory {
    public UserDao getUserDao(){
        return new UserDao();
    }
}
