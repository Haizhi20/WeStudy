package utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * @Author chanwcy
 * @Date 2022-01-19 11:48
 * @Version1.8
 *
 * 功能：对前端传送过来的密码进行第二次MD5加密
 */
@Component
public class MD5Util {
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    private static final String salt = "method_wcy";

    //实现功能：对前端传到后端的用户密码第一次加密
    public static String inputPasswordToEnd(String inputPassword){
        String newPassword = salt.charAt(0) + salt.charAt(2) + inputPassword + salt.charAt(5) + salt.charAt(4);
        return md5(newPassword);
    }
    //实现功能：对后端传到数据库的用户密码进行第二次加密
    public static String endPasswordToDB(String formPass,String salt){
        String str = salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(salt);
    }

    //
    public static String inputPasswordToDB(String inputPassword,String salt){
        String fromPass = inputPasswordToEnd(inputPassword);
        String dbPass = endPasswordToDB(fromPass,salt);
        return dbPass;
    }

    public static void main(String[] args) {
        System.out.println(inputPasswordToEnd("123456"));
        //运行结果：f25b7208688061b1cdddbd29d8513524
        System.out.println(endPasswordToDB("f25b7208688061b1cdddbd29d8513524","method_wcy"));
        //运行结果：d0193c9c3d15ff02ef4109ba9bb353fe
        System.out.println(inputPasswordToDB("123456","method_wcy"));
        //运行结果：d0193c9c3d15ff02ef4109ba9bb353fe
    }
}
