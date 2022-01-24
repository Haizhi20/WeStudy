package vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Author chanwcy
 * @Date 2022-01-19 21:12
 * @Version1.8
 * 功能描述：公共对象返回枚举
 */
@ToString
@AllArgsConstructor
@Getter
public enum RespBeanEnum {
    //通用
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务端异常"),
    //登录模块
    Login_ERROR(500210,"用户名或密码不正确")

    ;
    private final Integer code;
    private final String message;
}
