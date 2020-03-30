package com.young.modules.sys.service;

import com.young.modules.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 基本表
 服务类
 * </p>
 *
 * @author youngyanjun
 * @since 2020-03-23
 */
public interface IUserService extends IService<User> {

    User getByUserId(int id);

}
