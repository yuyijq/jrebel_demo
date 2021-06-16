package com.myapp.demo.web.controller;

import com.myapp.demo.core.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/test1")
    @ResponseBody
    public Object test() {
        return testService.test4();
    }
}
