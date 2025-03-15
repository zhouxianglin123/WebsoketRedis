package com.mybatisdemo.springbootmybatisplus.model;

import lombok.Data;

@Data
public class User {
    private int id;

    private String account;

    private String password;

    private String username;
}
