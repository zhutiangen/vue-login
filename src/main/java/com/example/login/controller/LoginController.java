package com.example.login.controller;

import com.example.login.model.UserModel;
import com.example.login.pojo.User;
import com.example.login.service.UserService;
import com.example.login.util.PasswordUtil;
import com.example.login.util.UuidUtil;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping(value = "/console")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private UserService loginService;

    /**
     * 登入模块
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@Valid UserModel userModel, BindingResult bindingResult) {
        try {
            if (bindingResult.hasErrors()) {
                bindingResult.getAllErrors().forEach(error -> {
                    logger.error(error.toString());
                });
                return;
            }
            // 数据库进行验证

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用户注册
     * @param userModel
     * @param result
     */
    @RequestMapping(value="register", method = RequestMethod.POST)
    public void register(@Valid UserModel userModel, BindingResult result) {
        try {
            if (result.hasErrors()) return;

            User user = new User();
            user.setuId(UuidUtil.getUUID());
            // SecureRandomNumberGenerator 用的是shiro的
            user.setSalt(new SecureRandomNumberGenerator().nextBytes().toHex());
            // 对密码进行MD5加密
            user.setPassword(PasswordUtil.createAdminPwd(userModel.getPassword(), user.getSalt()));
//            user.setCrtdDate(LocalDateTime.now());
            user.setUpdtdDate(new Date());

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public void loginout() {

    }
}
