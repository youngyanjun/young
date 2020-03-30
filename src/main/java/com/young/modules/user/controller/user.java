package com.young.modules.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youngyanjun
 * @date 2020-03-21 15:23
 */
@RestController("/api/")
public class user {
    @GetMapping("test")
    public int test() {

            return 1;

    }
}
