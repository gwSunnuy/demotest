package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author guowei
 * @Date 2020/8/15 16:19
 * @Version 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String id) {
        return "Hello Spring Boot! "+id;
    }

    @PostMapping("/hello1")
    public String hello1(@RequestParam String name, @RequestParam String name1) {
        return "Hello Spring Bootbbbbb! "+name+" "+name1;
    }
}
