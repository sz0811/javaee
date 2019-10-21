package org.sang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellerController {


    @GetMapping("/hello")
    public String hello(){
        System.out.print("123");
        return "hello springboot!";
    }

}
