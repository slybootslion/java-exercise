package com.slybootslion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello() {
        System.out.println(port);
        System.out.println("data source" + dataSource);
        return "hello Spring Boot";
    }
}
