package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloController {
        //接口:http://localhost:8080/hello
        @RequestMapping("/hello")
        public String hello() {
            //调用业务,接收前端的参数!
            return "hello,world";
        }

        @RequestMapping("/hello2")
        public String hello2() {
            //调用业务,接收前端的参数!
            return "hello2,world";
        }
}
