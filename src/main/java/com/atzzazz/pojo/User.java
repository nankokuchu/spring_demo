package com.atzzazz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description：userPOJO
 * @Author： zzazz
 * @Date： 2021/12/6 - 15:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;

}
