package com.pulan.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public String hi() {
        return "HI,morning!My second commit!I've report." +
                "just do it";
    }
}
