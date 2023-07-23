package com.mg.common.domain.enums;

/**
 * @Author Magi
 * @Date 2023/7/23 14:52
 * @Version 1.0
 * @Description
 */
public enum ExceptionCodeEnum {
    UNKNOWN_ERROR(-1, "未知错误"),
    VALID_ERROR(10001, "参数校验异常");

    private Integer code;
    private String msg;

    ExceptionCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
