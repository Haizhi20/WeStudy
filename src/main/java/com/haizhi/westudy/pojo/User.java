package com.haizhi.westudy.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author chanwcy
 * @Date 2022-01-23 03:13
 * @Version1.8
 */
@ApiModel(value="User对象")
public class User {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "登陆密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String eMail;

    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

    @ApiModelProperty(value = "是否删除")
    private Integer is_deletr;

    public User() {
    }

    public User(Integer id, String nickname, String username, String password, String eMail, String phoneNumber, Integer is_deletr) {
        this.id = id;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.is_deletr = is_deletr;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getIs_deletr() {
        return is_deletr;
    }

    public void setIs_deletr(Integer is_deletr) {
        this.is_deletr = is_deletr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", is_deletr=" + is_deletr +
                '}';
    }
}
