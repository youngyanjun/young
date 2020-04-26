package com.yxzapp.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author youngyanjun
 * @date 2020-03-23 17:18
 */
@Data
public class BaseEntity {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDate;
    /**
     * 创建者
     */
    private Long createBy;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateDate;
    /**
     * 修改者
     */
    private String updateBy;

}
