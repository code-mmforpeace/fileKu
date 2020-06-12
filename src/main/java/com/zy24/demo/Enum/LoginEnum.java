package com.zy24.demo.Enum;

public enum LoginEnum {
    ILLEGAL_ACCOUNT(0,"非法账号"),ROOT_ACCOUNT(1,"超级管理员");

    private Integer code;
    private String mesage;

    LoginEnum(Integer code, String mesage) {
        this.code = code;
        this.mesage = mesage;
    }

    public Integer getCode() {
        return code;
    }

    public String getMesage() {
        return mesage;
    }
}
