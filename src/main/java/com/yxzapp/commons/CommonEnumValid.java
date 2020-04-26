package com.yxzapp.commons;

import com.yxzapp.po.BaseErrorInfoInterface;

/**
 * @author youngyanjun
 * @date 2020-04-22 14:28
 */
public enum CommonEnumValid implements BaseErrorInfoInterface {
    //统一验证枚举,其他验证返回需自定义，
    NOT_NULL("00000001", "参数不能为空"),
    MIN("00000002", "参数值过小请检查"),
    PATTERN("00000003", "参数不合法请检查"),
    PAST("00000004", "日期错误，必须为过去的日期"),
    FUTURE("00000005", "日期错误，必须为将来的日期"),
    SIZE("00000006", "数据不在范围中"),
    NOT_EMPTY("00000007", "参数为NULL 或 ‘空’ 或 集合SIZE 为 0"),
    EMAIL("00000008", "邮箱格式错误，请检查！"),
    NOT_BLANK("00000009", "数据为:‘’");


    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    CommonEnumValid(String resultCode, String resultMsg) {
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
