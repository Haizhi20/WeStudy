package controller;

import mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chanwcy
 * @Date 2022-01-23 02:51
 * @Version1.8
 */
@RestController
@RequestMapping("/user")
public class UserLoginController {
    private UserMapper userMapper;

    //Login
    @PostMapping ("/login")
    public String login(String username,String password){
        userMapper.selectByUsernameAndPassword(username,password);
        if(username == null){
            return "failed";
        }
        return  "success";
    }

    //Info
    @GetMapping("info")
    //公共对象
    public R info(){
        return R.ok();
    }
}
