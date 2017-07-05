package com.swellwu.service;


import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "hello dubbo!";
    }
}
