package com.young.po;

import java.net.BindException;

/**
 * @author youngyanjun
 * @date 2020-03-23 19:09
 * 异常基础接口类
 */
public interface BaseErrorInfoInterface {
    /**
     * 错误码
     */
    String getResultCode();

    /**
     * 错误描述
     */
    String getResultMsg();
}
