package com.hzy.controller;

import com.hzy.bean.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2021/10/17 16:09
 */

@Slf4j
@RestController
public class MyController {

    @Autowired
    Animal cat;

    @RequestMapping("/cat")
    public Animal cat(){
        return cat;
    }
}
