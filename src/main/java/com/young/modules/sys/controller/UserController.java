package com.young.modules.sys.controller;


import com.young.modules.sys.entity.User;
import com.young.modules.sys.service.IUserService;
import com.young.modules.vo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 * 基本表
 * 前端控制器
 * </p>
 *
 * @author youngyanjun
 * @since 2020-03-23
 */
@RestController
@RequestMapping("/sys/user/")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("tset")
    public Object test(@Validated @RequestBody user id) {
        id.getId();
        User byId = iUserService.getById(id.getId());
        return byId;
    }


}
