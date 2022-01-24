package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * @Author chanwcy
 * @Date 2022-01-23 03:13
 * @Version1.8
 */
@Data
@ApiModel(value="User对象")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

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


}
