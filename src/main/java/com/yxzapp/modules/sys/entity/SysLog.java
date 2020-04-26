package com.yxzapp.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yxzapp.po.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author youngyanjun
 * @since 2020-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_log")
public class SysLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 入参
     */
    private String inParameter;

    /**
     * 出参
     */
    private String outParameter;

    /**
     * 操作IP
     */
    private String ip;

    /**
     * 模块
     */
    private String module;

    /**
     * 动作
     */
    private String action;


}
