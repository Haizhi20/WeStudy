package com.haizhi.westudy.utils;

/**
 * @author xiaoying
 * @create 2021-12-17 下午 3:04
 */
public class ResultUtil {

    private int status;  //100 fail  200 success
    private String message;
    private Object data;  //返回响应数据

    public static ResultUtil build(int status , String message , Object data){
        return new ResultUtil(status , message , data);
    }


    public ResultUtil() {
    }

    public ResultUtil(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultUtil{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
