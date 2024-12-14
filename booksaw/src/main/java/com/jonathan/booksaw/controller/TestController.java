package com.jonathan.booksaw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String testConnect() {

        return "Hello Jon";
    }
}
