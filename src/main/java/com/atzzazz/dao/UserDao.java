package com.atzzazz.dao;

import com.atzzazz.model.ResultInfo;
import com.atzzazz.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Description：userDao
 * @Author： zzazz
 * @Date： 2021/12/6 - 11:50
 */
@Repository
public class UserDao {

    private final String USER_NAME = "admin";
    private final String USER_PASSWORD = "aizhuzhu";

    public User queryByUserName(String userName) {
        User user = null;
        if (USER_NAME.equals(userName)) {
            user = new User();
            user.setUserId(1);
            user.setUserName(userName);
            user.setUserPassword(USER_PASSWORD);
        }
        return user;
    }
}
