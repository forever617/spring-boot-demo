package com.leo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller 用于声明这是一个Controller
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
