package com.yxzapp.commons;

import com.yxzapp.po.BaseErrorInfoInterface;

/**
 * @author youngyanjun
 * @date 2020-03-23 19:10
 */
public enum CommonEnumExperience implements BaseErrorInfoInterface {
    // 数据操作错误定义
    SUCCESS("200", "成功!"),
    BODY_NOT_MATCH("400", "请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("401", "请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    RSA_EX("500", "加密解密异常"),
    JSON_PARSE_ERROR("500", "JSON转换异常，请使用符合格式规范的JSON格式！"),
    SERVER_BUSY("503", "服务器正忙，请稍后再试!");

    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    CommonEnumExperience(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }

}
