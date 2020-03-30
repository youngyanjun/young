package com.young.modules.sys.mapper;

import com.young.modules.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 基本表
 Mapper 接口
 * </p>
 *
 * @author youngyanjun
 * @since 2020-03-23
 */
@Mapper
public interface MUserMapper extends BaseMapper<User> {

}
