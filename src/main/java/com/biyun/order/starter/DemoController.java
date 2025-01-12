package com.biyun.order.starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/demo")
    public String demo() {
        return "HelloWorld!";
    }
}
