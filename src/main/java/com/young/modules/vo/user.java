package com.young.modules.vo;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author youngyanjun
 * @date 2020-03-23 19:45
 */
@Data
public class user  {
    @NotNull(message = "参数不能为空")
    @Max(value = 124,message = "参数值过大")
    private int id;
}
