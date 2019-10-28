package org.sang.controller;

import org.sang.model.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "api/user")
public class UserController {
    @PostMapping("/login")
    public  String login(Model model){
        User user = new User();
        user.setName("123");
        user.setAge(18);
        user.setSex("m");
        model.addAttribute("user",user);
        return "user";
    }

}
