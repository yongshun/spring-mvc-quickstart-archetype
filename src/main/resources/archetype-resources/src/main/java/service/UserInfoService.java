package com.xys.service;

import com.xys.modal.UserInfo;

import org.springframework.stereotype.Service;

/**
 * Created by xiongyongshun on 15/10/26.
 */
@Service
public class UserInfoService {
    public UserInfo getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("xys");
        userInfo.setAge(18);
        return userInfo;
    }
}
