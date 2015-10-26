package com.xys.controller;

import com.xys.service.UserInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiongyongshun on 15/10/26.
 */
@Controller
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("userInfo", userInfoService.getUserInfo());
        logger.info("Show Use Info!");
        return "show_user_info";
    }
}