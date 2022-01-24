package com.haizhi.westudy.dao;

import com.haizhi.westudy.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaoying
 * @create 2022-01-24 下午 4:03
 */
@Mapper
public interface UserDao {

    @Select("SELECT * FROM tb_user WHERE username = #{username} AND password = #{password}")
    User login (@Param("username") String username , @Param("password")String password);

    @Insert("INSERT INTO tb_user(username , password) VALUES(#{username} , #{password})")
    void addUser(@Param("username") String username , @Param("password")String password);
}
