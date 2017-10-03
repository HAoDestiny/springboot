package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Destiny_hao on 2017/10/2.
 */
@RestController
@RequestMapping("test")
public class testController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
