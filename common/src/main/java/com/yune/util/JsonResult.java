package com.yune.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonResult<T> {

    /** 成功 */
    private static final Integer SUCCESS = 200;
    /** 没有登录 */
    private static final Integer NOT_LOGIN = 400;

    /** 发生异常 */
    private static final Integer EXCEPTION = 401;

    /** 系统错误 */
    private static final Integer SYS_ERROR = 402;

    /** 参数错误 */
    private static final Integer PARAMS_ERROR = 403;

    /** 不支持或已经废弃 */
    private static final Integer NOT_SUPPORTED = 410;

    /** AuthCode错误 */
    private static final Integer INVALID_AUTHCODE = 444;

    /** 太频繁的调用 */
    private static final Integer TOO_FREQUENT = 445;

    /** 未知的错误 */
    private static final Integer UNKNOWN_ERROR = 499;
    private  int code;
    private T data;
    private String msg;

    public JsonResult<T> code(int code) {
        this.code = code;
        return this;
    }
    public JsonResult<T> msg(String msg) {
        this.msg = msg;
        return this;
    }
    public JsonResult<T> data(T data) {
        this.data = data;
        return this;
    }

    public static JsonResult build(){

        return  new JsonResult();
    }
    public static JsonResult build(int code){

        return new JsonResult().code(code);
    }
    public static JsonResult build(int code, String msg) {
        return new JsonResult<String>().code(code).msg(msg);
    }
    public static <T> JsonResult<T> build(int code, T data) {
        return new JsonResult<T>().code(code).data(data);
    }
    public static <T> JsonResult<T> build(int code, T data,String msg) {
        return new JsonResult<T>().code(code).data(data).msg(msg);
    }
    public static <T> JsonResult<T> build(int code, String msg, T data) {
        return new JsonResult<T>().code(code).msg(msg).data(data);
    }
    public static JsonResult ok() {
        return build(SUCCESS,"SUCCESS");
    }
    public static JsonResult ok(String msg) {
        return build(SUCCESS, msg);
    }
    public static <T> JsonResult<T> ok(T data) {
        return build(SUCCESS, data,"SUCCESS");
    }
    public static JsonResult error() {
        return build(EXCEPTION);
    }
    public static JsonResult error(String msg) {
        return build(EXCEPTION, msg);
    }
}
