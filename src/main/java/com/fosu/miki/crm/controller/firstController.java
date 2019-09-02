package com.fosu.miki.crm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class firstController {

    @GetMapping(value = "")
    String index() {
        return "Hello Spring Boot";
    }
}
