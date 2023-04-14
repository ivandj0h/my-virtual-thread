package com.devnexus.loom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return Thread.currentThread().toString();
    }

    @GetMapping("/hello")
    public String hello2() {
        return Thread.currentThread().toString();
    }
}
