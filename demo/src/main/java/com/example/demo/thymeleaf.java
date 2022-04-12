package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class thymeleaf {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("testThymeleaf")
    public String testThymeleaf(Map map) {
        map.put("info", "testThymeleaf");
        return "index";
    }

}