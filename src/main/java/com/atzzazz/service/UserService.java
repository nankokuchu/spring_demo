package com.atzzazz.service;

import com.atzzazz.dao.UserDao;
import com.atzzazz.model.ResultInfo;
import com.atzzazz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    public ResultInfo userLogin(String userName, String userPassword) {
        ResultInfo resultInfo = getResultInfo();

        if (isEmpty(userName)|| isEmpty(userPassword)) {
            ResultInfo resultInfoError = noUser(resultInfo);
            return resultInfoError;
        }

        User user = userDao.queryByUserName(userName);

        if (user == null) {
            resultInfo.setCode(500);
            resultInfo.setMsg("用户名不存在");
            return resultInfo;
        }

        if(!userPassword.equals(user.getUserPassword())){
            resultInfo.setCode(500);
            resultInfo.setMsg("用户密码错误");
            return resultInfo;
        }

        resultInfo.setCode(200);
        resultInfo.setMsg("用户登入成功");
        return resultInfo;
    }


    private ResultInfo noUser(ResultInfo resultInfo) {
        resultInfo.setCode(500);
        resultInfo.setMsg("用户名不能为空");
        return resultInfo;
    }

    /*
     * @Author： zzazz
     * @Description //TODO 获取ResultInfo对象
     * @Date 15:33 2021/12/6
     * @Param []
     * @return com.atzzazz.model.ResultInfo
     **/
    private ResultInfo getResultInfo() {
        return new ResultInfo();
    }

    /**
     * @Author： zzazz
     * @Description //TODO 判断传过来的变量是否为null，或者是空字符串
     * @Date 15:54 2021/12/6
     * @Param [str]
     * @return boolean
     **/
     private boolean isEmpty(String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }


}
