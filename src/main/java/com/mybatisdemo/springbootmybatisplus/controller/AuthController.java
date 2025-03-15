package com.mybatisdemo.springbootmybatisplus.controller;

import com.mybatisdemo.springbootmybatisplus.JsonResponse;
import com.mybatisdemo.springbootmybatisplus.model.User;
import com.mybatisdemo.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    @ResponseBody
    public JsonResponse login(String account, String password) {
        if (account == null || account.equals("") || password == null || password.equals("")) {
            return JsonResponse.fail("Login failed");
        }

        User user = userService.login(account, password);

        JsonResponse response = JsonResponse.success("Login success: " + user.getUsername());
        response.setData(user);

        return response;
    }
}
