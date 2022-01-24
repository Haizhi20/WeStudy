package com.haizhi.westudy.service;


import com.haizhi.westudy.utils.ResultUtil;

/**
 * @author xiaoying
 * @create 2022-01-24 下午 4:09
 */
public interface UserService {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    ResultUtil login(String username , String password);

    /**
     * 用户注册
     * @param username
     * @param password
     * @return
     */
    ResultUtil addUser(String username , String password);

}
