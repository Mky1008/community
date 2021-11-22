package com.mky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author hou
 * @Data 2021/11/15 22:58
 * @Description
 */

@Controller
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){
        return "index";
    }

}
