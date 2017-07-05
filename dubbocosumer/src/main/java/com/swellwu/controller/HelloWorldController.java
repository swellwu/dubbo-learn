package com.swellwu.controller;

import com.swellwu.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuxinjian on 2017/7/5.
 */
@Controller
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return helloWorldService.hello();
    }
}
