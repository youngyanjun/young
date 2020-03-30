package com.young.modules.sys.service.impl;

import com.young.modules.sys.entity.User;
import com.young.modules.sys.mapper.MUserMapper;
import com.young.modules.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 基本表
 服务实现类
 * </p>
 *
 * @author youngyanjun
 * @since 2020-03-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<MUserMapper, User> implements IUserService {
    @Autowired
    private MUserMapper mUserMapper;

    @Override
    public User getByUserId(int id) {
        User user = mUserMapper.selectById(id);

        return user;
    }
}
