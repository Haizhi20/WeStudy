package com.haizhi.westudy.service.impl;

import com.haizhi.westudy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haizhi.westudy.pojo.User;
import com.haizhi.westudy.service.UserService;
import com.haizhi.westudy.utils.ResultUtil;

/**
 * @author xiaoying
 * @create 2022-01-24 下午 4:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResultUtil login(String username, String password) {

        User user = userDao.login(username , password);
        if(user == null){
            return ResultUtil.build(100 , "用户名或密码错误",null);
        }
        return ResultUtil.build(200,"登录成功",user);
    }

    @Override
    public ResultUtil addUser(String username, String password) {

        try{
            userDao.addUser(username , password);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.build(100 , "注册失败" , null);
        }

        return ResultUtil.build(200 , "注册成功" , null);
    }
}
